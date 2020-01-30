
/*
Array : Collection of homogeneous data.

Types:
- Single dimension/subscript
	int a[]={1,2,3,4,5};
	int []a = new int [5];
	
	int a[] = new int[5];
	
	
- Multi dimension 
*/
// getting &printing 1d array ...

import java.util.*;
class Array_1
{
	public static void main(String args[])
	{	
		int a[] = new int [5];
		int i;
	Scanner s = new Scanner(System.in);
	
	System.out.print("\n\nEnter the elements : ");
	for(i=0;i<5;i++)
		a[i]=s.nextInt();
	
	System.out.println("\nYou have given :");
	
	for(i=0;i<5;i++)
		System.out.println(a[i]);
	}
}
				
		


















