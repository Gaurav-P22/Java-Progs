import java.util.Scanner;
class SumRow
{
public static void main(String ar[])
{
int i,j,r1=0,r2=0,r3=0,r4=0;
int A[][]=new int[4][5];
Scanner sc=new Scanner(System.in);
System.out .println("Enter Elements of Matrix:");
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
A[i][j]=sc.nextInt();
}
}
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
if(i==0)
r1+=A[i][j];
if(i==1)
r2+=A[i][j];
if(i==2)
r3+=A[i][j];
if(i==3)
r4+=A[i][j];
}
}
System.out .println("Sum of Row 1:"+r1);
System.out .println("Sum of Row 2:"+r2);
System.out .println("Sum of Row 3:"+r3);
System.out .println("Sum of Row 4:"+r4);
}
}
