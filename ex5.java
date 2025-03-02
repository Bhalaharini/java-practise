
import src.pack.pack;

import java.io.*;
import java.util.*;

class ex5{
    public static void main(String[] args){
        int rn, m1, m2,m3;
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter roll no:");
        rn = s.nextInt();
        System.out.println("Enter marks:");
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();
        System.out.println("enter name:");
        name = s.next();
        pack obj = new pack(rn,m1,m2,m3,name);

    }
}
