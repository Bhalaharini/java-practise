import java.io.*;
import java.util.*;
public class ex2 {
    public static void main(String[] args){
        int a,b,c,d,num=0,den=0,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter (a/b)");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Enter (c/d)");
        c = s.nextInt();
        d = s.nextInt();
        if (b==d){
            num = a+c;
            den = b;
        }
        else{
            num = a*d+c*b;
            den = b*d;
        }
        n = num<den?num:den;
        for(int i=2;i<n;i++){
             if((num % i == 0) && (den % i == 0)){
                num/=i;
                den/=i;
                i--;
    
            }
        }
        System.out.println("the fraction is"+num+"/"+den);
    }
   
}
