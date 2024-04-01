package strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {

		String str = "java java c git c";
		String[] words = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		Set<String> values = map.keySet();
		for (String value : values) {
			if (map.get(value) > 1) {

				System.out.println(value + " - " + map.get(value));
			}
		}
		
	}

}
