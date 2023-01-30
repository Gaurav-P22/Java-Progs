//WAP to initialize a String with 10 Integers and print all Elements with Sum
import java.util.Scanner;
class Stringscan
{
public static void main(String args[ ])
{
int sum=0,value;
String st="20 30 10 15 25 55";
Scanner sc=new Scanner(st);
while(sc.hasNextInt())
{
value=sc.nextInt();
System.out.println(value);
sum+=value;
}
System.out.println("Sum:"+sum);
}
}
