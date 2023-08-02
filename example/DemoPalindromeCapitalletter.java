package example;

public class DemoPalindromeCapitalletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Nitin";   //5
		  String strRev ="";
		  //output - emocleW - 
		  
		  char ch[] = str.toCharArray();
		    // {'n', 'i', 't', 'i', 'n'}
		  System.out.println(ch);
		  
		  for(int i=str.length()-1; i>=0;i-- )
		  {
		   strRev = strRev + ch[i]; // n,i, t, i, n
		  }
		  
		  System.out.println(strRev);
		  
		  if(str.equalsIgnoreCase(strRev))
		  {
		   System.out.println(" String is palindrome");
		  }
		  else
		  {
		   System.out.println(" String is not palindrome");
		  }
	}

}
