package javaconcepts;

public class CountVowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vCount=0,cCount=0;
		String s="This Is a Sentence";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vCount++;
			}
			else if(ch>='a' && ch<='z')
			{
				cCount++;
			}
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}

}
