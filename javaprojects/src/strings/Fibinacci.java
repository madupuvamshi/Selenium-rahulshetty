 package strings;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=1,k;
		k=0;
		System.out.println("1");
		while(k<=50) {
			k=a+b;
			
			//System.out.println(k);
			a=b;
			b=k;
			System.out.println(k);
		}
	}

}
