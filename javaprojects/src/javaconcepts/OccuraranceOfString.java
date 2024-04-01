package javaconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class OccuraranceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="vamshi";
	      Map<Character,Integer> charmap=new HashMap<Character,Integer>();
	      char[] ch=str.toCharArray();
	      for(char c:ch){
	          if(charmap.containsKey(c)){
	              charmap.put(c , charmap.get(c)+1);
	          } else {
	              charmap.put(c ,1);
	          }
	      }
	      System.out.println(charmap);
	  }

}
