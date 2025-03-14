package Words;

import java.util.Scanner;

public class Dupilicates 
{
	void display(String s)
		{
		int count=1;
		 	char c[]=s.toCharArray();
		 	char s1=0;
			for(int i=0;i<c.length;i++)
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						count++;
						s1=c[i];
					}
					break;
				}
			}
			if(count>=1)
			{	
					System.out.println(s1+"  is repeated "+count+" times");
			}
			else
			{
				System.out.println("No");
			}
			
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Dupilicates d= new Dupilicates();
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		d.display(s);

	}

}
