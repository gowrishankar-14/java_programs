import java.util.*;
public class FactorialNum
{
    static int factorial(int num)
    {
        if(num>=1)
        {
            return num*factorial(num-1);
        }
        else
        {
        return 1;
        }
       
    }
    
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter The Number:");
	    int num=s.nextInt();
	    
	    System.out.println("Factorial Of "+num+" is:"+factorial(num));
	}
}
