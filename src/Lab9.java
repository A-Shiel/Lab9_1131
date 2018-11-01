/**
 * Created by Aden on 11/1/2018
 * Team Members : Nik Stojcevich, Anthony Safford, Matthew Pelukas
 *
 */
public class Lab9 {
	
	public static int fibonacci(int n) {
		n = Math.abs(n);
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static int sumDigits(int n) {
		if (n == 0) {
			return 0;
		} else {
		return n % 10 + sumDigits(n / 10);
		}
	}
	
	public static boolean isPalindrome(String s) {
		String reversedString = reverseString(s);
		return s.equals(reversedString);
	}
	
	public static String reverseString(String s2) {
		if (s2.length() <= 1) {
			return s2;
		} else {
			return reverseString(s2.substring(1)) + s2.charAt(0);
		}
	}
	
    public static Integer maxValue(Integer[] a) {
    	return findMaxValue(a, a.length);
    }
    
    public static Integer findMaxValue(Integer[] a, int value) {
    	if (value == 1) {
    		return a[0];
    	} else {
    		return Math.max(a[value - 1], findMaxValue(a, value -1));
    	}
    }
} //End of class
