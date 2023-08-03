import java.util.*;
class Duplicate 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
	    System.out.print("Enter the size of an array = ");
		int size=s.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter the element in array = ");
		for(int k=0; k<arr.length; k++)
		{
			arr[k]=s.nextInt();
		}
		System.out.print("Array without of duplicate elemnt = ");
		for(int i=0; i<arr.length; i++)
		{   int count=0;
			for(int j=1+i; j<arr.length; j++)
			{
			   if(arr[i]==arr[j])
			   count++;
			}
			if(count==0)
			{
				System.out.print(arr[i]+" ");
			}

		}
		
	}
}
