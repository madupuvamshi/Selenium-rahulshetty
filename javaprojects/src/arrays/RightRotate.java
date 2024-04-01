package arrays;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rightRotate(new int[]{1,2,3,4,5,6,7},3);
		
	}

	private static void rightRotate(int[] input, int n) {

		System.out.println("Before rotate");
		System.out.println(Arrays.toString(input));
		int temp;
		for(int i=1; i<=n; i++) {
			temp=input[input.length-1];
			for(int j=input.length-1; j>0; j--) {
				input[j]=input[j-1];
			}
			input[0]=temp;
		}
		System.out.println("After rotate");
		System.out.println(Arrays.toString(input));
	
	}

}
