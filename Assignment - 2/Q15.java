import java.util.Scanner;
class Q15
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n1 = ");
		float n1 = sc.nextFloat();
		
		System.out.println("n2 = ");
		float n2 = sc.nextFloat();
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		
	}
	
}