package Assignment_lms;

public class Q2Cmprstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "w3school.com"; 
		String	str2 = "W3School.com";
	    StringBuffer strbuf = new StringBuffer(str1);
	    
	    System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
	    
	    System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
	}

}
