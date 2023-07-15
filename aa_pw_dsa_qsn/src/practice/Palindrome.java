package practice;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		String palind = "";
		for(int i=str.length()-1; i>=0; i--) {
			palind += str.charAt(i);
		}
		if(str.equals(palind)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
