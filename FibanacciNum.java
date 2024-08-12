import java.util.*;

public class FibanacciNum
{
    static int fibanacci(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else
        {
            return fibanacci(num-1)+fibanacci(num-2);
        }
    }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=s.nextInt();
		
		System.out.println("The Fibanacci Number of "+num+" is:"+fibanacci(num));
	}
}
