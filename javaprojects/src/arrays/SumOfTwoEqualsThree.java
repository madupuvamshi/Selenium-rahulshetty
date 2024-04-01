package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SumOfTwoEqualsThree {

	public static void main(String[] args) {

		int[] a= {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		HashSet<Integer> set=new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length-1; j++) 
			{
				if(set.contains(a[i] + a[j]))
				{
					System.out.println( a[i]+ ", "+a[j]+ " ,"+(a[i]+a[j]));
				}
			}
		
	}
}

}
