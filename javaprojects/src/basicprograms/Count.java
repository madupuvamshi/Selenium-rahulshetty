package basicprograms;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =countOccurences("aaajanda", 'a');
		System.out.println(count);
	}

	private static int countOccurences(String word, char character) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count++;
			}
		}
		return count;
	}

}
