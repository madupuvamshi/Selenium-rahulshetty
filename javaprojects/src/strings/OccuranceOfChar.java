package strings;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello";
		Map<Character,Integer> charMap=new HashMap<>();
		char[] chars=str.toCharArray();
		for(char c : chars)
		{
			if(!charMap.containsKey(c)) {
				charMap.put(c, 1);
			} else {
				int value = charMap.get(c);
				charMap.put(c, value+1);
				
			}
		}
		System.out.println(charMap);
	}

}
