package strings;

public class ReverseRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcd";  //it should rotate in circular order
		String s2="cdab";
		if(s1.length()!=s2.length())
		{
			System.out.println("Not matching");
		}
		else{
		String s3=s1+s1;	
		if(s3.contains(s2)) 
		{
			System.out.println("matching");
			}
		else 
			System.out.println("not");
	        }
	}

}
