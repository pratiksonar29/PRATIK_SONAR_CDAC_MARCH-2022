class PP5
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;--i)
		{
			for(int k=i*2;k>=1;--k)
				
			System.out.print(" ");
			
			for(int j=i;j<=9;++j)
				
			System.out.print(j+" ");
			
			for(int b=8;b>=i;--b)
		    {	
			    if(i==9)
				System.out.print(" ");
				
				else
				System.out.print(b+" ");
			}
		
		System.out.println();
		}
	}
}