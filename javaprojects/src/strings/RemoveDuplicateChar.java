package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str="progarmming";
		
		//approach 1 java 8
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
		
		//approach 2 indexOf 
		StringBuilder sb2=new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch, i+1);
			if(index ==  -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		//approach 3 CharacterArray
		char[] arr=str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			boolean flag=false;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				sb3.append(arr[i]);
		}
		}
		System.out.println(sb3);
	
		
		//By using set
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(Character c :set) {
			sb4.append(c);
		}		
	System.out.println(sb4);
	}

}
