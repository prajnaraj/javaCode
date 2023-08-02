package example;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // string reverse 
		  
		  String str = "welcome";   //7
		  String strRev ="";
		  //output - emocleW - 
		  
		  char ch[] = str.toCharArray();
		  
		  System.out.println(ch);
		  
		  for(int i=str.length()-1; i>=0;i-- )
		  {
		   strRev = strRev + ch[i];
		  }
		  
		  System.out.println(strRev);
		 }

			
	}


