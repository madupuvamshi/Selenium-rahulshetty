package basicprograms;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		int sum=sumArray(a);
		System.out.println(sum);
	}

	private static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			//System.out.println(a[i]);
		}
		return sum;
	}
}
