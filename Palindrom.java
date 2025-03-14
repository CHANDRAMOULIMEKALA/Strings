package Words;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		String temp=s;
		String ns="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ns=ns+s.charAt(i);
		}
		System.out.println(ns);
		if(ns.equals(temp))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not aPalindrom");
		}
}
}
