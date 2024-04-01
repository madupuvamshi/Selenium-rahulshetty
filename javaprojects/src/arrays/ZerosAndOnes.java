package arrays;

import java.util.Arrays;

public class ZerosAndOnes {

	public static void main(String[] args) {

		int[] arr= {0,1,0,1,0,1};
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				arr[j++]=arr[i];
			}
		}
		while(j<arr.length) {
			arr[j++]=1;
		}
		System.out.println(Arrays.toString(arr));
		
		//Method 2
		int[] a= {0,1,1,0,1};
		int left=0;
		int right=a.length-1;
		while(left<right)
		{
			if(a[left]==1) {
				a[right] = a[right]+a[left];
				a[left] = a[right]-a[left];
				a[right] = a[right]-a[left];
				right--;
			}
			else {
				left++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
