package strings;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7;
		boolean flag=false;
		for(int i=2; i<=num/2 ; i++) {
			if(num%i == 0) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("it is not prime");
		else
			System.out.println("its prime number");
	}

}
