package javaconcepts;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using buffer 
		/*String s="Automation";
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		StringBuilder str = sb.reverse();
		System.out.println(str);*/
		
		
		StringBuffer sb=new StringBuffer("Automation");
		System.out.println(sb.reverse());
		
		
	}

}
