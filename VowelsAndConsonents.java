package Words;

public class VowelsAndConsonents {

	public static void main(String[] args)
	{
		String s="Krishna Manohar yadav";
		int vc=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
			String ns=s.toUpperCase();
			char c=ns.charAt(i);
			if(c!=' ' )
			{
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='u')
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
		}
		System.out.println("Vowels of Count: "+vc);
		System.out.println("Consonents of  Count: "+cc);
		
	}

}
