//Assignment 12.0
import java.util.Scanner;
class Assign12a
{
public static void main(String args[])
{
int i,sum=0,count=0;
for(i=1;i<99;i++)
{
if(i%2!=0)
{
sum+=i;
count++;
}
}
System.out.println("Sum of odd between 1 to 99 :"+sum);
System.out.println("Counter :"+count);
}
}