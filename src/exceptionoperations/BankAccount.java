package exceptionoperations;

public class BankAccount {
     private String name;
     private double Balance;
     private final double MIN_BALANCE=10000;

      BankAccount(String name,double Balance) throws MInBalanceException
     {
         this.name=name;
         if(Balance<MIN_BALANCE)
         {
             throw new MInBalanceException("you cant create an account without having a minimum balance of "+MIN_BALANCE);
         }
         else {
             this.Balance+=Balance;
         }
     }


     void deposit(double depositAmount)
     {
         Balance+=depositAmount;

     }
     void withdraw(double withdrawAmount) throws MInBalanceException
     {
         if(Balance-withdrawAmount<MIN_BALANCE)
         {
             throw new MInBalanceException("cant withdraw money now.minimm balance will become lesser than "+MIN_BALANCE);
         }
         else {
             Balance-=withdrawAmount;
         }

     }
     void showBalance()
     {
         System.out.println("name:"+name);
         System.out.println("balance: "+Balance);

     }

}
