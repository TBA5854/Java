public class Assignment_day_5_q_2	 {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,5,6,7,7,7,7,7,78,9};
		int size = a.length;
		int[] b= new int[size];
		int no_of_non_duplicates=0;
		for (int i =0; i<size;i++)
		{
			boolean already_not_have = true;
			for (int j : b)
			{
				if (a[i]==j)
				{
					already_not_have=false;
				}
			}
			if (already_not_have)
			{
				b[i]=a[i];
				no_of_non_duplicates++;
			}
		}
		int[] arr= new int [no_of_non_duplicates];
		for (int l=0,m=0 ; l< b.length ; l++)
		{
			if(b[l]!=0)
			{
				arr[m]=b[l];
				m++;
			}
		}
		for (int o: arr)
		{ 
		System.out.println(o);
		}
	}
}