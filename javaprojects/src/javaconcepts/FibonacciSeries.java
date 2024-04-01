package javaconcepts;

public class FibonacciSeries {

	//using iterative
	static void Fibonacci(int N) {
		int num1=0, num2=1;
		int count=0;
		while(count<N) {
			System.out.print(num1+" ");
			int num3=num2+num1;
			num1=num2;
			num2=num3;
			count=count+1;
		}
	}
	public static void main(String[] args) {
		int N=10;
		Fibonacci(N);

	}

}
	/*public static void main(String[] args) {
	int n1=0,n2=1,sum=0;
	System.out.print(n1+" "+n2);
	for(int i=0;i<10;i++)
	{
		sum=n1+n2;
		System.out.print(" "+sum);
		n1=n2;
		n2=sum;
	}
	
	}
		
}*/
