import java.util.*;

class Alpha implements Runnable {
    private char startChar, endChar;
    private int delay;
    private Object lock;

    public Alpha(char startChar, char endChar, int delay, Object lock) {
        this.startChar = startChar;
        this.endChar = endChar;
        this.delay = delay;
        this.lock = lock;
    }

    public void run() {
        for (char c = startChar; c != endChar + ((startChar > endChar) ? -1 : 1); c += (startChar > endChar) ? -1 : 1) {
            synchronized (lock) {
                System.out.println(c);
                lock.notify();
                try {
                    if (c != endChar) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread forwardThread = new Thread(new Alpha('A', 'Z', 1000, lock));
        Thread backwardThread = new Thread(new Alpha('Z', 'A', 2000, lock));
        forwardThread.start();
        backwardThread.start();
    }
}