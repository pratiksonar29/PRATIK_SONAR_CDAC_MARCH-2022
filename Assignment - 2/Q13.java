import java.util.Scanner;
class Q13
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Width = ");
		float Width = sc.nextFloat();
		
		System.out.println("Height = ");
		float Height = sc.nextFloat();
		
		System.out.println("Area = "+(Width*Height));
		System.out.println("Perimeter = "+2*(Width+Height));
		
	}
	
}