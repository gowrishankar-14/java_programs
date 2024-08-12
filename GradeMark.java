import java.util.Scanner;
public class GradeMark
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int mark=s.nextInt();
	    
	    if(mark>=0)
	    {
            if(mark>=90)
	        {
	           System.out.print("Grade A");
	        }
	        else if(mark>=80)
	        {
	            System.out.println("Grade B");
	        }
	        else if(mark>=70)
	        {
	            System.out.println("Grade C");
	        }
	        else if(mark>=50)
	        {
	            System.out.println("Grade D");
	        }
	        else if(mark<50)
	        {
	            System.out.println("Grade E");
	        }
	        else
	        {
	           System.out.println("Invalid Marks");
	        }
	    }
	    else
	    {
	        System.out.println("Invalid Mark");
	    }
}
}