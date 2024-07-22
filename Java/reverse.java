import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int i,n,s=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter no.");
		n=obj.nextInt();
	    for(i=n;i>0;i=i/10)
			s=s*10+(i%10);									
		System.out.println("reverse="+s);
		
	}
}