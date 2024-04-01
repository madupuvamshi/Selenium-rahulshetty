package strings;

import java.util.Arrays;

public class SortingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="selenium";
		char arr[]=str.toCharArray();
		char temp;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(arr);
	

	//method 2
	
	String s="selenium";
	char[] chArr=s.toCharArray();
	Arrays.sort(chArr);
	System.out.println(chArr);
	
	
	
	}
}
	

