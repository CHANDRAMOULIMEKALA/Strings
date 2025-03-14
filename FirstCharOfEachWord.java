package Words;

public class FirstCharOfEachWord {

	public static void main(String[] args)
	{
		String s="Nandamuri Taraka Ramarao";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				ns=ns+s.charAt(i);
			}
			else
			{
				System.out.println(ns.charAt(0)+" ");
				ns="";
			}
		}
		System.out.print(ns.charAt(0));
		
	}

}
