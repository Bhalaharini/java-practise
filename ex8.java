import java.io.*;
import java.util.*;
class ex8{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char a[] = s.nextLine().toCharArray();
        char b[] = s.nextLine().toCharArray();
        if(a.length!=b.length){
            System.out.println("Different!!!!\n");
        }
        else{
            Arrays.sort(a);
            Arrays.sort(b);
            boolean eq = Arrays.equals(a,b);
            if(eq){
                System.out.println("Anagram!!!!\n");
            }
            else{
                System.out.println("NP!!!");
            }
        }
    }
}

