import java.util.Scanner;
class arrayin{
public static void main(String args[ ])
{
int[ ] A=new int[9];
System.out.println("Enter Elements of Array:");
Scanner input= new Scanner(System.in);
for(int i=0;i<9;i++)
{
A[i]=input.nextInt();
}
for(int i=0;i<9;i++)
{
System.out.println("Element"+(i+1)+":\t"+A[i]);
}
}
}

