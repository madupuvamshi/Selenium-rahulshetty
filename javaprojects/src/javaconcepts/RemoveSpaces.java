package javaconcepts;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter something ");
		String input=sc.nextLine();
		String spacesRemoved=input.replaceAll("\\s", "");
		System.out.println(spacesRemoved);*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something ");
		String input=sc.nextLine();
		char[] chArr=input.toCharArray();
		String stringWithOutSpaces="";
		for(int i=0;i<chArr.length;i++)
		{
			if((chArr[i] !=' ') && (chArr[i] !='\t'))
			{
				
				stringWithOutSpaces = stringWithOutSpaces + chArr[i];
			}
		}
		System.out.println(stringWithOutSpaces);
	}

}
