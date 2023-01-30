import java.util.Scanner;
class sumofdigit
{
public static void main(String args[ ])
{
long i,n,m,sum=0,digi=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to find its sum of digits:");
n=sc.nextLong();
m=n;
while(n!=0)
{
m=n%10;
if(n!=0)
{
digi++;
}
sum+=m;
n=n/10;
}
System.out.println("sum of digits is:"+sum);
System.out.println("digits is:"+digi);
}
}
