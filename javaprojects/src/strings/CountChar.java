package strings;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java is java again java";   //counting 'a' char how many times it occurs
		char c='a';
		int count=s.length()-s.replace("a", "").length();
		System.out.println(count);
	}

}
