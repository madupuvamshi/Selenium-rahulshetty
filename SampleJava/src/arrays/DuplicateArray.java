package arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {4,4,2,2,1,7,9,7};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
