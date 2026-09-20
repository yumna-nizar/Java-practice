//program to copy the content of an image file to another image file without buffering
package fileoperations;

import java.io.*;

public class CopyImageFileContent {
    static void main() {
        long time=System.nanoTime(); //start of measuring time
        try(FileInputStream fis=new FileInputStream("src\\fileoperations\\exampleimage.jpg");
            FileOutputStream fos=new FileOutputStream("src\\fileoperations\\exampleimagecopy.jpg"))
        {
            int data;

            while((data=fis.read())!=-1)
            {
                fos.write(data);
            }
            System.out.println((System.nanoTime()-time)/1000000000);//end //gives the time taken to run the code from start mark to this mark


        }catch(FileNotFoundException fnf){
            System.out.println(fnf);
        }catch (IOException io)
        {
            System.out.println(io);
        }
    }
}
