import java.util.Scanner;
class printname
{                                             
public static void main(String []args)
{
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter name");
	String name = obj.next();
	System.out.println("hello " + name + " have a good day");
}
}
