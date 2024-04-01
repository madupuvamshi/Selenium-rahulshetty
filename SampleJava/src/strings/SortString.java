package strings;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str="programming";
		
		//approach 1
		char[] arr=str.toCharArray();
		char temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
		
		//appraoch 2
		
		char[] charr=str.toCharArray();
		Arrays.sort(charr);
		System.out.println(charr);
		
	}

}
