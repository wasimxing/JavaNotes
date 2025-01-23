package conditonalStatments;

public class if_else {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int brr[]= {8,7,6,5,4,3,2,1};
		
		if(a>b)
		{
			System.out.println("a is greater : "+ a);
		}
		else
		{
			System.out.println("b is greater : "+ b);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>arr[i])
			{
				System.out.println(arr[i]);
				for(int j=0; j<brr.length; j++)
				{
					if(brr[j]>brr[j])
					{
						System.out.println(brr[j]);
					}
					else
					{
						System.out.println(brr[j]);
					}
				}
				
				
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
