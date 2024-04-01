 package javaconcepts;

public class CountAnyLetterInString {

	public static void main(String[] args) {
		String s="vamshi";
		int count=0;
		//System.out.println("string :"+s);
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
				count++;
		}
		//System.out.println("letters :" +count);
		System.out.println(count);
	}
	
}
