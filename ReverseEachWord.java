package Words;

public class ReverseEachWord {

	public static void main(String[] args) 
	{
		String s="Mekala mouli Yadav";
		String ns="";
		String word[]=s.split(" ");
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		for(String words:word)
		{
			String rw="";
			for(int i=words.length()-1;i>=0;i--)
			{
				rw=rw+words.charAt(i);
			}
			ns=ns+rw+" ";
		}
		System.out.println("Reverse of the each word in string: "+ns);
	}

}
