package strings;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="opentext";
		 char charToReplace = 't';
		 
		 if(input.indexOf(charToReplace)== -1)
		 {
			 System.out.println("given string is not available");
			 //System.exit(0);
		 }
		 int count = 1;
		 for(int i=0;i<input.length(); i++) {
			char ch= input.charAt(i);
			if(ch == charToReplace) {
				input=input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		 }
		 System.out.println(input);
	}

}
