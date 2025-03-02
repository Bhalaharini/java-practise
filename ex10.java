import java.io.*;
import java.util.*;
public class ex10{
    public static void main(String[] args) throws IOException{
        String sourcepath = "source.txt";
        String destpath ="dest.txt";

        FileInputStream fis = new FileInputStream(sourcepath);
        FileOutputStream fos = new FileOutputStream(destpath);

        byte[] buffer = new byte[1024];
        int bytesread;
        while((bytesread = fis.read(buffer))!=-1){
           
            fos.write(buffer,0,bytesread);
            System.out.println("Written Successfully");
        }

        fis.close();
        fos.close();
    }
}
