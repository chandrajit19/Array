import java.util.*;
class Merge 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
	    System.out.print("Enter the size of first array = ");
		int size1=s.nextInt();
        int[] a1=new int[size1];
		System.out.print("Enter the elements in first array = ");
		for(int i=0; i<a1.length; i++)
		     {
		    	a1[i]=s.nextInt();
		      }
		System.out.print("Enter the size of second array = ");
		int size2=s.nextInt();
        int[] a2=new int[size2];
        System.out.print("Enter the elements in second array = ");
		for(int j=0; j<a2.length; j++)
		     {
			   a2[j]=s.nextInt();
		     }
		// here  i am getting size of new array  and declaire the array

		int[] merged=new int[a1.length+a2.length];
		// copying the element of first array in new array
		for(int i=0; i<a1.length; i++)
		   {
			   merged[i]=a1[i];
		    }
			// copying the element of second array in new array
		for(int j=0; j<a2.length; j++)
		    {
			   merged[a1.length+j]=a2[j];
		     }
		//System.out.println(Arrays.toString(merged)); 
		for(int k=0; k<(a1.length+a2.length); k++)
		  {
			System.out.print(merged[k]+" ");
		  }

	}
}
