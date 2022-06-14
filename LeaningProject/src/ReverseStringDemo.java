
public class ReverseStringDemo {
	public static void main(String[] args)
	{
		String sentence = "SIET";
		char ch[]=sentence.toCharArray();
		
		for(int i=sentence.length()-1; i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

}
