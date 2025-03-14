package Words;

import java.util.Random;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		String s1="ABCDEFGHIGKLMNOPQRSTUVWXYZ0987654321!@#$%^&*";
		int length=s1.length();
		StringBuilder sb=new StringBuilder();
		System.out.print("Password size:");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int index=r.nextInt(length);
			char randomchar=s1.charAt(index);
			sb.append(randomchar);

		}
		System.out.println(sb);
	}

}
