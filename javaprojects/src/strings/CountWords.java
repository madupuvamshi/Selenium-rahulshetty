package strings;

public class CountWords {

	public static void main(String[] args) {

		//Method 1
		String s="my name is vamshi";
		String[] word=s.trim().split(" ");
		System.out.println(word.length);
	
		//method 2
		int count=1;
		for(int i=0; i<s.length()-1; i++) 
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!= ' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
