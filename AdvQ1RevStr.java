/* write a program reverse string without in-built function*/
package Assignment_lms;

public class AdvQ1RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Lion", nstr="";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Lion");
        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i); //extracts each character
          nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
      }
  }
	


