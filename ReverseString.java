package Words;

public class ReverseString {

	public static void main(String[] args)
	{
		String s="YadaV";
		String ns="";
		for(int i=s.length()-1; i>=0;i--)
		{
			
			ns=ns+s.charAt(i);;
		}
		System.out.println(ns);
	}

}
