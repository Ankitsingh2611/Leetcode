import java.util.Scanner;
class percentage
{
	public static void main(String []args)
	{
		float sub1,sub2,sub3,sub4,sub5,per;
		Scanner obj= new Scanner(System.in);
		System.out.printf("enter sub1 marks:");
		sub1=obj.nextFloat();
		System.out.printf("enter sub2 marks:");
		sub2=obj.nextFloat();
		System.out.printf("enter sub3 marks:");
		sub3=obj.nextFloat();
		System.out.printf("enter sub4 marks:");
		sub4=obj.nextFloat();
		System.out.printf("enter sub5 marks:");
		sub5=obj.nextFloat();
		per= ((sub1+sub2+sub3+sub4+sub5)/500)*100;
		System.out.println("percentage="+per);
		//System.out.print(per);
	}
}
		
		