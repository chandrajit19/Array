import java.util.*;
class ArrayDemo 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size = ");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.print("Enter the value = ");
		for(int i=0; i<size; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Array is = ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
} 
