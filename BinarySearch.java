import java.util.*;

public class BinarySearch
{
    static int BinarySearch(int arr[],int start,int end,int target)
    {
        
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            
            if(arr[mid]==target)
            {
                System.out.println("Target Found");
                break;
            }
            
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        if(start>end)
        {
            System.out.println("Element Not In Array");
        }
        return 0;
    }
    
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		int start=0;
		int end=arr.length-1;
		int target=12;
		
		BinarySearch(arr,start,end,target);
	}
	
	
}
