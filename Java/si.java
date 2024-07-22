import java.util.*;
class si
{
	public static void main(String args[])
	{
		int si,p,r,t;
		Scanner obj= new Scanner(System.in);
		System.out.print("enter p");
		p=obj.nextInt();
		System.out.print("\n enter r");
		r=obj.nextInt();
		System.out.print(" \n enter t");
		t=obj.nextInt();
		si=(p*r*t)/100;
		System.out.println("simple intrest="+si);
	}
}
		