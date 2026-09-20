package exceptionoperations;

public class MInBalanceException extends Exception{
    MInBalanceException(String msg)
    {
        super(msg);

    }
    public String toString()
    {
         return "there should be atleast 10000 as minimum balance";
    }
}
