import java.util.*;
class calculator
{
    public void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double no1,no2,res; String ss;
        System.out.println("Enter 1st Number:");
        no1=sc.nextDouble();
        System.out.println("Enter 2nd Number:");
        no2=sc.nextDouble();
        System.out.println("Select Symbol:");
        ss=sc.next();
        switch(ss)
        {
            case "+": res=no1+no2;
            System.out.println("Addition is="+res);
            break;
            case "-": res=no1-no2;
            System.out.println("Subtraction is="+res);
            break;
            case "*": res=no1*no2;
            System.out.println("Multiplication is="+res);
            break;
            case "/": res=no1/no2;
            System.out.println("Division is="+res);
            break;
            default:
                System.out.println("Invalid Symbol");
                break;
        }
    }
}