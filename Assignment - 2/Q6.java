import java.util.Scanner;
class Q6
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n1 = ");
		int n1 = sc.nextInt();
		
		System.out.println("n2 = ");
		int n2 = sc.nextInt();
		
		System.out.println("SUM of two numbers = "+n1+"+"+n2+"="+(n1+n2));
		System.out.println("Product of two numbers = "+n1+"X"+n2+"="+(n1*n2));
		System.out.println("Subtraction of two numbers = "+n1+"-"+n2+"="+(n1-n2));
		System.out.println("Division of two numbers = "+n1+"/"+n2+"="+(n1/n2));
		System.out.println("Remainder of two numbers = "+n1+"%"+n2+"="+(n1%n2));
		
	}
	
}