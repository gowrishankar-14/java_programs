import java.util.*;
public class SumArray
{
	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);

		System.out.print("Enter Array Size: ");
		int size=s.nextInt();

		int arr2[]= new int[size];

		for(int i=0; i<size; i++)
		{
			System.out.print("Enter "+i+" the Element:");
			arr2[i]=s.nextInt();
		}

		for(int i=0; i<size; i++)
		{
			sum+=arr2[i];
		}

		for(int i=0; i<size; i++)
		{
			System.out.print(arr2[i]+"  ");
		}
		System.out.println();
		System.out.println("The Sum Of Array Elements Is:"+sum);
	}
}
