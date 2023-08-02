package example;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("welcome");
		String str1 = "welcome";
		String str2 = "welcome";
		if(str.equals(str1))
		{
			System.out.println("str and str1 are same = equals method");
		}
		int a=10,b=10;
		if(a==b)
		{
			System.out.println("a is eqal to b integer");
		}
		
		
		if(str1 == str2)
		{
			System.out.println("str1 and str2 same with == operator");
		}
		if(str == str2)
		{
			System.out.println("str and str2 same with == operator");
		}
		
	}

}
