//Program to find a the roots of a quadratic equation
import java.util.Scanner;
class Root
{
public static void main(String args[ ])
{
float a,b,c;
double d,root,root1,root2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a:");
a=sc.nextFloat();
System.out.println("Enter value of b:");
b=sc.nextFloat();
System.out.println("Enter value of c:");
c=sc.nextFloat();
d=((b*b)-4.0*a*c);
if(d<0.0)
{
System.out.println("No root is possible");
}
else if(d==0.0)
{
root=(-b)/(2.0*a);
System.out.println("one root is possible:"+root);
}
else 
{
root1=((-b)+Math.sqrt(d))/(2.0*a);
root2=((-b)+Math.sqrt(d))/(2.0*a);
System.out.println("Roots of Quadratic Equations are:"+root1+","+root2);
}
}
}

