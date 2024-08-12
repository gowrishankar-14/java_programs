import java.io.*;
import java.util.Scanner;
import java.util.*;

public class StringReverse
{
	public static void main(String[] args)
	{
		String name="akash";

		String name2="";
        int arlen=name.length();
        
        for(int i=arlen-1;i>=0;i--)
        {
            name2+=name.charAt(i);
        }

        System.out.println(name2);
	}
}
