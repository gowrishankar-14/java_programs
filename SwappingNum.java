public class SwappingNum
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=35;
		System.out.println("Before Swapping A="+a+" B="+b);
		swap(a,b);
	}
	
	static void swap(int a,int b)
	{
	    int temp;
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("After Swapping A="+a+" B="+b);
	}
}
