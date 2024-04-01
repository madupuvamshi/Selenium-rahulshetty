package strings;

import java.util.HashMap;

public class RepeatAndNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java concept of the day";
		String removeSpace=str.replaceAll("\\s", "");
		System.out.println(removeSpace);
		HashMap<Character,Integer> charCount=new HashMap<>();
		char[] strArray=removeSpace.toCharArray();
		for(char c:strArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}else {
				charCount.put(c, 1);
			}
		}
		for(char c:strArray) {
			if(charCount.get(c)==1) {
				System.out.println("first non repeat character " + removeSpace+ " is " + c);
				break;
			}
		}
		for(char c:strArray) {
			if(charCount.get(c)>1) {
				System.out.println("repeat char" + removeSpace+ " is " + c);
				break;
			}
		}
	}

}
