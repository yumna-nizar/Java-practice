package fileoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFIleContents {
    static void main() {
        try(FileInputStream fis=new FileInputStream("src\\fileoperations\\sentence.txt");
            FileOutputStream fos=new FileOutputStream("src\\fileoperations\\sentencecopy.txt"))
        {
            int data;
            while((data= fis.read())!=-1)
            {
                fos.write(data);
            }

        }catch (FileNotFoundException fnf)
        {
            System.out.println(fnf);

        }catch(IOException io)
        {
            System.out.println(io);
        }

    }

}
