import java.io.*;
import java.util.*;

interface ad{
    public void sum_divisor(int n);
}
class abc implements ad{
    int sum = 0;
    public void sum_divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("The sum is "+sum);
    }
}
class ex7{
    public static void main(String[] args){
        abc obj = new abc();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n = s.nextInt();
        obj.sum_divisor(n);
    }
}