package javaconcepts;

import java.util.Scanner;

public class CountVowelsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
	      System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();

	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given sentence is "+count);
	   }
	}
