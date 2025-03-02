import java.io.*;
import java.util.*;
class ex1{
    public static void main(String[] args){
        int sal;
        float ic;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter salary");
        sal = s.nextInt();
        if(sal <= 50000){
            ic =0;
        }
        else if(sal >50000 && sal <=60000){
            ic = (float)0.1*(sal-50000);
        }
        else{
            ic=(float)(0.2*(sal-60000)+(0.1*10000));
        }
        System.out.println("Your salary is"+ic);

    }
}