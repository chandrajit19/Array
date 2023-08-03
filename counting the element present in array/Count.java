class  Count
{
	public static void main(String[] args) 
	{
		int[] a={2,3,4,7};
		int count=0;
		for(int x: a)
		{
			count++;
			System.out.print(x);
		}
		System.out.println("\nElements = "+count);
	}
}
