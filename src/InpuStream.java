import java.io.*;

public class InpuStream {
    static void main() {
        try(  FileWriter fw=new FileWriter("C:\\Users\\user\\IdeaProjects\\MySecondJavaProject\\src\\abc.txt"))
        {
            FileOutputStream fos=new FileOutputStream("\\abc.txt");
            fos.write(65);
            fos.write(43585);
            FileOutputStream foso=new FileOutputStream("myfiletowrite.txt");
            FileOutputStream fosd=new FileOutputStream("src\\myfiletowrite1.txt");
//            FileWriter fw=new FileWriter("C:\\Users\\user\\IdeaProjects\\MySecondJavaProject\\src\\abc.txt");
//            fw.write("C");

//            FileInputStream fls=new FileInputStream("C:\\Users\\user\\IdeaProjects\\MySecondJavaProject\\src\\abc.txt");
//            InputStreamReader inps=new InputStreamReader(fls);
//            int data=inps.read();
//            System.out.println(data);
//            int data=fls.read();
//            System.out.println(data);
//            data=fls.read();
//            System.out.println(data);
//            data=fls.read();
//            System.out.println(data);
//            data=fls.read();
//            System.out.println(data);
//            byte[] b=new byte[100];
//            int data=fls.read(b);
//            System.out.println(data);



        }catch (IOException f)
        {
            System.out.println(f);
        }

    }


}
