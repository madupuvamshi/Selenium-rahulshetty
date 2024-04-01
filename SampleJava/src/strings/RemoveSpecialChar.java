package strings;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="!@#vamshi$%^";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		
	}

}
