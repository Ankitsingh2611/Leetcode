import java.util.*;
class add{
public static int sum(int a,int b){
int sum=0;
sum=a+b;
return sum;
}
public static void main(String ak[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter two no:");
int x=sc.nextInt();
int y=sc.nextInt();
int a=sum(x,y);
System.out.println("sum of two:"+a);
}
}