package strings;

public class StringWithoutSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="my name is vamshi";
		char[] charr=s.toCharArray();
		String withoutSpaces="";
		for(int i=0;i<charr.length; i++)
		{
			if((charr[i]!=' ') && (charr[i]!='\t'))
			{
				withoutSpaces = withoutSpaces+charr[i];
			}
		}
		System.out.println(withoutSpaces);
	}

}