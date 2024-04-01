package strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="java code";
		System.out.println("original string:" + input);
		String output="";
		String[] words=input.split(" ");
		for(String word:words)
		{
			String revword=" ";
			for(int i=word.length()-1; i>=0; i--)
			{
				revword=revword + word.charAt(i);
			}
			output=output+revword+" ";
			
		}
		System.out.println(output);
	}

}
