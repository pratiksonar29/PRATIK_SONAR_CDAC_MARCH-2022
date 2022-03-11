/* 1
   2  3
   4  5  6
   7  8  9  10
   11 12 13 14 15 */
class Pattern17
{
	public static void main(String args[])
	{
		int k=0;
		for(int i=5;i>=1;--i)
		{
			for(int j=5;j>=i;--j)
			{
		      k++;
			  if (k>9)
				System.out.print(k+"  ");
			  else
				  System.out.print(k+"   ");
			}
			System.out.println();
		}
	}
}	