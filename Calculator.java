import java.util.Scanner;

class Calculation 
{
    public static void Addition(int a,int b)
    {
        int sum=0;
        sum=a+b;
        System.out.println("Addition of "+a+"+"+b+":"+sum);
    }

    public static void Subtraction(int a,int b)
    {
        int diff=0;
        diff=a-b;
        System.out.println("Subtraction of "+a+"-"+b+":"+diff);
    }

    public static void Multiplication(int a,int b)
    {
        int product;
        product=a*b;
        System.out.println("Product of "+a+"*"+b+":"+product);
    }

    public static void Division(int a,int b)
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

        System.out.print("Enter a:");
        int a=s.nextInt();

        System.out.print("Enter b:");
        int b=s.nextInt();

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

        }
        
    }



    
}
