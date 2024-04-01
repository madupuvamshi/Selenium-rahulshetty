package javaconcepts;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="vamshi";
		int count=0;
		System.out.println("string:" + s);
		for(char ch: s.toCharArray())
		{
			ch=Character.toLowerCase(ch);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("vowels:" + count);
		System.out.println(count);
	}

}
