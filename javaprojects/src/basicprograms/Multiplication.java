package basicprograms;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result= multiply(5,10);
		System.out.println(result);
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=0;
		
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}
	return sum;
	}

}
