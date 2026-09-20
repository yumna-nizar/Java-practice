package fileoperations;

import java.io.*;

public class CopyImageFIleContentBuffer {
    static void main() {
        long time=System.nanoTime(); //start of measuring time
        try(FileInputStream fis=new FileInputStream("src\\fileoperations\\exampleimage.jpg");
            FileOutputStream fos=new FileOutputStream("src\\fileoperations\\exampleimagecopy.jpg");
            BufferedInputStream bis=new BufferedInputStream(fis);
            BufferedOutputStream bos=new BufferedOutputStream(fos))
        {
            int data;

            while((data=bis.read())!=-1)
            {
                bos.write(data);
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
