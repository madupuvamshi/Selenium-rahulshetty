package arrays;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leftRotate(new int[]{1,2,3,4,5,6,7},2);
		
		}

		private static void leftRotate(int[] input, int n) {

			System.out.println("Before rotate");
			System.out.println(Arrays.toString(input));
			int temp;
			for(int i=0; i<n; i++) {
				temp=input[0];
				for(int j=0; j<input.length-1; j++) {
					input[j]=input[j+1];
				}
				input[input.length-1]=temp;
			}
			System.out.println("After rotate");
			System.out.println(Arrays.toString(input));
			
	}

}
