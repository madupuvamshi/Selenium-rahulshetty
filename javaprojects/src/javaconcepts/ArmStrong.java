package javaconcepts;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=153;
		int temp=n;
		int r, sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
		if(temp==sum)
			System.out.println("Its an armstrong number");
		else
			System.out.println("Its not an armstrong number");
	}

}
