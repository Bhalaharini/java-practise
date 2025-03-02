import java.io.*;
import java.util.*;
class Negvalexc extends Exception{
    Negvalexc(String message){
        super(message);
    }
}
public class ex9{
    public static void main(String[] args){
        try{
            int a[] = {1,2,3,-4,5};
            for(int num:a){
                if(num<0){
                    throw new Negvalexc("Exception caught at:"+num);
                }
            }
            System.out.println("NO!!!!!!");
        }
       
        catch(Negvalexc e){
            System.out.println("\nException: "+e.getMessage());
        }
    }
}