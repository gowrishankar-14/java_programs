import java.util.Scanner;

class Calculation 
{
    public void Addition(int a,int b)
    {
        int sum=0;
        sum=a+b;
        System.out.println("Addition of "+a+"+"+b+":"+sum);
    }

    public void Subtraction(int a,int b)
    {
        int diff=0;
        diff=a-b;
        System.out.println("Subtraction of "+a+"-"+b+":"+diff);
    }

    public void Multiplication(int a,int b)
    {
        int product;
        product=a*b;
        System.out.println("Product of "+a+"*"+b+":"+product);
    }

    public void Division(int a,int b)
    {
        int div;
        div=a/b;
        System.out.println("Division of "+a+"/"+b+":"+div);
    }
}

public class Calculator 
{
    public static void main(String[] args)
    {

        Calculation ob=new Calculation();

        Scanner s=new Scanner(System.in);
        
        int a,b;

        System.out.print("Enter a:");
        a=s.nextInt();
        
        System.out.print("Enter b:");
        b=s.nextInt();

        System.out.println("Enter Your Operation: 1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int op=s.nextInt();

        switch(op)
        {
            case 1:
            ob.Addition(a,b);
            break;

            case 2:
            ob.Subtraction(a,b);
            break;

            case 3:
            ob.Multiplication(a, b);
            break;

            case 4:
            ob.Division(a, b);
            break;
            
            default:
            System.out.println("Enter valid Option");
        }
    }    
}
