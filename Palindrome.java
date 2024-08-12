import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Palindrome
{
	public static void main(String[] args)
	{
		String name1="malayalam";

		String name2="";
        int arlen=name1.length();
        
        for(int i=arlen-1;i>=0;i--)
        {
            name2+=name1.charAt(i);
        }

        if(name1.equals(name2))
        {
            System.out.println("It Is a Palindrome");
        }
        else
        {
            System.out.println("It is Not a Palindrome");
        }
	}
}
