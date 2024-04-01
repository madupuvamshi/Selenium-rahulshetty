package dailyPractise;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a=4;
		boolean flag=false;
		for(int i=2; i<=Math.sqrt(a) ; i++)
		{
			if(a%i==0) 
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("NOT prime");
		}
		else
		{
			System.out.println(" prime");
		}*/
		
		//Method 2
		/*int a=4;
		int count=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(" prime");
		} else
			System.out.println("Not prime");*/
		
		//Method 3
		for (int i=2; i<=100; i++)
		{
			boolean isPrime=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
			}
			if(isPrime)
					System.out.println(i);
		}
	}

}
