import java.util.*;
class  Average
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of an array = ");
		int size=s.nextInt();
		int[] a=new int[size];
		double sum=0;
		double ave=0;
		System.out.print("Enter the elements of an array = ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		ave=sum/a.length;
		System.out.println("Avarage is = "+ave);

	}
}
