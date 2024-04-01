package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {1,9,-55,55,9,55};
		int n = num.length;
		
		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(num[i]>highest) {
				secondhighest=highest;
				highest=num[i];
				
			}
			if(num[i]<highest && num[i]> secondhighest) {
				secondhighest=num[i];
			}
		}		
		System.out.println(secondhighest);
		
		
		//Arrays.sort(num);
		//System.out.println(num[n-2]);
		
		//method 2
		/*/Arrays.sort(num);
		for(int i=n-2 ; i>=0 ; i--) {
			if(num[i] != num[n-1]) {
				System.out.println(num[i]);
			}
		}	
		*/
		}
}
