package fileoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFIle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        byte[] b=sentence.getBytes();
        try(FileOutputStream fos=new FileOutputStream("src\\fileoperations\\sentence.txt");
            FileInputStream fis=new FileInputStream("src\\fileoperations\\sentence.txt"))
        {
             for(int i=0;i<b.length;i++)
             {
                 fos.write(b[i]);
             }
             int data;
             while((data=fis.read())!=-1)
            {
                System.out.print((char)data);
            }




        }catch (FileNotFoundException fnf)
        {

        }catch (IOException io)
        {

        }


    }

}
