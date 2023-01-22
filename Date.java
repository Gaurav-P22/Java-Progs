//Assignment 5.0
import java.util.Scanner;
class Date
{
int month,day,year;
Date(int x,int y,int z)
{
day=x;
month=y;
year=z;
}
void setday(int DAY)
{
day=DAY;
}
int getday()
{
return day;
}
void setmonth(int MON)
{
month=MON;
}
int getmonth()
{
return month;
}
void setyear(int YR)
{
year=YR;
}
int getyear()
{
return year;
}
void displaydate()
{
System.out.println(day+"/"+month+"/"+year);
}
public static void main(String args[])
{
Date d=new Date(12,8,2021);
Scanner sc=new Scanner(System.in);
System.out.println("Enter day: ");
int DAY=sc.nextInt();
d.setday(DAY);
System.out.println("Enter Month: ");
int MON=sc.nextInt();
d.setmonth(MON);
System.out.println("Enter year: ");
int YR=sc.nextInt();
d.setyear(YR);
d.displaydate();
}
}