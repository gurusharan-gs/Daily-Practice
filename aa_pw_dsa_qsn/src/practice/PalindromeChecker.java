package practice;

public class PalindromeChecker {

	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return true;
		}

		str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "racecar";
		boolean result = isPalindrome(str);
		if (result) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
