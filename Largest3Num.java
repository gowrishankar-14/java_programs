import java.util.Scanner;
public class Largest3Num
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter Three Numbers");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    
	    if(a>b && a>c)
	    {
	        System.out.println(a+" is Largest Than B and C");
	    }
	    else if(b>c)
	    {
	        System.out.println(b+" is Largest Than A and C");
	    }
	    else
	    {
	        System.out.println(c+" is Largest Than A and B");
	    }
	}
}
