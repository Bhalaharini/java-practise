import java.util.Random;
class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(10); // Generate random integer between 0 and 99
            System.out.println("Generated number: " + number);

            Thread evenThread = new EvenNumberThread(number);
            Thread oddThread = new OddNumberThread(number);

            if (number % 2 == 0) {
                evenThread.start();
            } else {
                oddThread.start();
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class EvenNumberThread extends Thread {
    private int number;
    public EvenNumberThread(int number) {
        this.number = number;
    }

    public void run() {
       // System.out.println("Square of " + number + ": " + (number * number));
       int fact=1;
       for(int i=1;i<=number;i++){
       
        fact *=i;
       }
       System.out.println(fact);
    }
}
class OddNumberThread extends Thread {
    private int number;
    public OddNumberThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}
public class MultiThreadedApplication {
    public static void main(String[] args) {
        
        new NumberGenerator().start();
        
    }
}


