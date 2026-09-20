import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    static void main()  throws FileNotFoundException,IOException {
        try(FileReader rd=new FileReader("hello.txt"))
        {
            System.out.println("inside the try block");
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);
        }
    }
}

