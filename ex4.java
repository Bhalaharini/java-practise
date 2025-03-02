import java.io.*;
import java.util.*;

class sample{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int x, int y, int z){
        System.out.println(x+y+z);
    }
}

public class ex4{
    public static void main(String[] args){
        sample s= new sample();
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        int b = o.nextInt();
        int c = o.nextInt();
        s.add(a,b);
        s.add(a,b,c);

    }
}