/*               1
               1 2 1
             1 2 3 2 1
           1 2 3 4 3 2 1
         1 2 3 4 5 4 3 2 1
       1 2 3 4 5 6 5 4 3 2 1
     1 2 3 4 5 6 7 6 5 4 3 2 1
   1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1   */
class PP4
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;++i)
		{
			for(int k=18;k>=i*2;--k)
				
			System.out.print(" ");
			
			for(int j=1;j<=i;++j)
				
			System.out.print(j+" ");
			
			for(int b=i-1;b>=1;--b)
		    {	
			    if(i==1)
				System.out.print(" ");
				
				else
				System.out.print(b+" ");
			}
		
		System.out.println();
		}
	}
}