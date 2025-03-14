package Words;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			count++;
		}
		System.out.println(count);


	}

}
