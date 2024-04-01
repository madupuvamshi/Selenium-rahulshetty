package javaconcepts;

import java.util.Scanner;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Name");
		String input=sc.nextLine();
		sc.close();
		String newinput=input.replaceAll("[AEIOUaeiou]", "");
		System.out.println(newinput);
	}

}
