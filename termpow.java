import java.util.Scanner;
class termpow
{
public static void main(String args[])
{
long a,n,result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter terms upto you want to print :");
n=sc.nextInt();
System.out.println("Enter starting number :");
a=sc.nextInt();
System.out.println("Series is :");
while(n!=0)
{
result=a*a;
System.out.print(result+" ");
n--;
++a;
}
}
}