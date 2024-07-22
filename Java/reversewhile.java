import java.util.*;
class reversewhile
{
	public static void main(String args[])
	{
		int n,rem,rev=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter no.");
		n=obj.nextInt();
	    while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println("reverse="+rev);
	}
}