package example;

public class AscendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[]= {67,34,5,3};
		System.out.println("before sorting");
		for(int i=0;i<ages.length;i++)
		{
			System.out.println(ages[i]);
		}
		for(int i =0;i<ages.length;i++)
		{
			for(int j=i+1;j<ages.length;j++)
			{
				//int temp;
				if(ages[i]>ages[j])
				{
				int	temp=ages[i];
					ages[i]=ages[j];
					ages[j]=temp;
				}
			}
			
		}
		System.out.println("after sorting");
		for(int i=0;i<ages.length;i++)
		{
			System.out.println(ages[i]);
		}
	}

}
