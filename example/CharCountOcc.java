package example;

public class CharCountOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="java program";
		
		int count =0;
		
		System.out.println(s.length());
		//System.out.println(s.charAt());
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("count of a="+count);
	}

}
