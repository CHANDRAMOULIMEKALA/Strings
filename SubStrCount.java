package Words;

import java.util.Scanner;

public class SubStrCount {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==32)
			{
			count++;
			}
		}
		System.out.println(count);
	}

}
