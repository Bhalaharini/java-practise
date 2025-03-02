import java.io.*;
import java.util.*;
public class ex3 {
    public static void main(String[] args){
        int a[] = new int[10];
        int b[] = new int[10];
        int len1,len2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length 1");
        len1 = s.nextInt();
        System.out.println("enter length 2");
        len2 = s.nextInt();
        System.out.println("Enter elements 1");
        for(int i=0;i<len1;i++){
                a[i] = s.nextInt();
        }
        System.out.println("Enter elements 2");
        for(int i=0;i<len1;i++){
                b[i] = s.nextInt();
        }
        if(len1!=len2){
            System.out.println("Not equal");
        }
        else{
            int eq=1;
            for(int i=0;i<len1;i++){
                if(a[i]!=b[i]){
                    eq=0;
                    break;
                }
            }
            if(eq==1){
                System.out.println("Equal");
            }
            else{
                System.out.println("Npt equql");
            }
        }
        
    }
}
