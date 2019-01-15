package mavenprogram.mavenprogram;

public class array 
  {
	public static void main(String[] args) 
	{
		int arr[]={23,44,12,34,45};
		int d=0;
		int max=arr[0];
		int max1=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			d=d+arr[i];
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<max1)
			{
				max1=arr[i];
			}
		}
		System.out.println("sum of array is : "+d);
		System.out.println("largest no is : "+max);
		System.out.println("smallest no is :"+max1);
		int max3=arr[0];
		int secondmax=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{ 
			if(arr[i]>max3)
			{
				secondmax=max3;
				max3=arr[i];
			}
			else if (arr[i] > secondmax) 
			{
				secondmax = arr[i];
			}	
		}
		System.out.println("second largest no is : "+secondmax);
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==34)
			{
				count++;
			}
		}
		System.out.println("no search element is present in array : "+count);
	    int even[] = null ;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even no in array: "+arr[i]);
				//int a=arr[i];
				//even[i]=a;
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("odd no in array: "+arr[i]);
			}
		}
		/*for(int i=0;i<=even.length-1;i++)
		{
			System.out.print("odd no in array: "+even[i]);
		}*/
		int temp=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		String num="200";
		int m=Integer.parseInt(num);
		System.out.println((m/2)*100);
		float n=Float.parseFloat(num);
		System.out.println(n+10);
	}
}
