package Assignment_lms;

public class Q3STRComprIgnrCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "HELLO";
		String str3 = "Another String";
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
	}

}
