import java.util.*;

public class ExceptMark 
{
	public static void main(String[] args) {
	int[] arr={};
	int k=4;
	int e=15;
    lac(arr,k,e);  
}      

static void lac(int arr[],int k,int e)
{
    Arrays.sort(arr);
    int sum=0;
    
    if(arr.length!=0)
    {
    for(int i=0;i<k;i++)
    {
        sum = sum+arr[i];
    }
    if(sum<e)
    {
        System.out.println("Bad");
    }
    else if(sum==e)
    {
        System.out.println("Average");
    }
    else
    {
        System.out.println("Outstanding");
    }
    }
    
    else
    {
        System.out.println("Array is Empty");
    }
}
}

	
