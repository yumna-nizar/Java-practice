package calculating;

public class Division implements calculator{
    public void calculate(double a,double b){
        if (b == 0) {
            System.out.println("divide by zero is not possible");

        }
        else {
            System.out.println(a+" / "+b+" = "+(a/b));
        }


    }
}
