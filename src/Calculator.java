public class Calculator {
    int value;

    public Calculator add(int n)
    {
        value=value+n;
        return this;
    }
    public Calculator subtract(int n)
    {
        value=value-n;
        return this;
    }
    public void display()
    {
        System.out.println("value is = "+value);
    }


}


