package calculating;

import java.util.Scanner;

public class calculateMain {

    public static double[] TakeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st input: ");
        Double num1=sc.nextDouble();
        System.out.println("enter the second input: ");
        double num2=sc.nextDouble();
        double[] arr={num1,num2};
        return arr;
    }

    public static void main(String[] args){
        calculator obj;
        System.out.println("Welcome to the calculator program \n\n\n");
        System.out.println("*********************************");
        boolean wantToContinue=true;
        do{
            System.out.println("which operation do u want to do? \n press the option number");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();



            if(option<4 || option >1) {
                double[] arr=TakeInput();
                switch (option) {
                    case 1:
                        obj = new Addition();
                        obj.calculate(arr[0], arr[1]);
                        break;

                    case 2:
                        obj = new Subtraction();
                        obj.calculate(arr[0], arr[1]);
                        break;

                    case 3:
                        obj = new Multiplication();
                        obj.calculate(arr[0], arr[1]);
                        break;

                    case 4:
                        obj = new Division();
                        obj.calculate(arr[0], arr[1]);
                        break;


                }

            }
            else {
                System.out.println("invalid operation option");
            }




            System.out.println("do you still want to continue?true for yes false for no");
            wantToContinue=sc.nextBoolean();
        }while(wantToContinue);


    }
}
