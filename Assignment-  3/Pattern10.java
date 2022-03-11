/*   E
    D E
   C D E
  B C D E
 A B C D E  */
class Pattern10
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;++i)
		{
			for(int k=5;k>i;--k)
			{
				System.out.print(" ");
			}
				for(char j = (char) ('F' - i) ;j<='E';++j)
			
				System.out.print(" "+j);
			    System.out.println();
		}
	}
}	