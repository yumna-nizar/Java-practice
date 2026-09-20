package exceptionoperations;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args)
    {
        BankAccount b=null;
        try
        {
            b=new BankAccount("yumna",9000);
            b.deposit(10);
            b.withdraw(1000);



        }
        catch(MInBalanceException mbe)
        {
            System.out.println(mbe.getMessage());
        }
        finally {

            b.showBalance();
        }


    }


}
