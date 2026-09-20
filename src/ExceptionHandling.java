public class ExceptionHandling {
    public static void display() throws ArithmeticException{
        int b=0;
        if(b==0) {
            throw new ArithmeticException();
        }

        System.out.println("end of display");

    }

    public static void greet()
    {
        display();
        System.out.println("end of greet");
    }


    public static void main(String[] args)
    {
        greet();
        System.out.println("end of main method");


    }

}
