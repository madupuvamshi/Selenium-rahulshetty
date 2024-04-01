package strings;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Method 1 tochar array
		
		String str="hello";
		char[] charr=str.toCharArray();
		for(int i=charr.length-1; i>=0; i--) {
			System.out.print(charr[i]);
		}
		
		System.out.println(" ");
//charAt()
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
