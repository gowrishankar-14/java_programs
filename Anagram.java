import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Anagram
{
	public static void main(String[] args)
	{
		String name1="arma";
		String name2="rmaa";
		
		char arr1[]=new char[name1.length()];
		char arr2[]=new char[name2.length()];
		
        int arlen1=name1.length();
        int arlen2=name2.length();
        
        if(arlen1==arlen2)
        {
        for(int i=0;i<name1.length();i++)
        {
            arr1[i]=name1.charAt(i);
            arr2[i]=name2.charAt(i);
        }
        
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("It is an Anagram");
        }
        }
        else
        {
            System.out.println("It is Not an Anagram");
        }
        
	}
}
