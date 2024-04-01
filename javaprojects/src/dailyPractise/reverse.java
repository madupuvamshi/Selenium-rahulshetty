package dailyPractise;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(9/0.0);
		        String s = "abc12zx34";
		        String reversedString = reverseString(s);

		        System.out.println(reversedString); // Output: cba12xz34
		    }

		    private static String reverseString(String input) {
		        char[] charArray = input.toCharArray();
		        int left = 0;
		        int right = charArray.length - 1;

		        while (left < right) {
		            // Swap characters at left and right indices
		            char temp = charArray[left];
		            charArray[left] = charArray[right];
		            charArray[right] = temp;

		            // Move indices towards the center
		            left++;
		            right--;
		        }

		        return new String(charArray);
		    }
		

	}


