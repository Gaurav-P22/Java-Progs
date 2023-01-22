//Program to take input through Command Line Arguement

class commandline
{
public static void main(String args[ ])
{
for(int i=0;i<args.length;i++)
System.out.println("Name"+(i+1)+"\t"+args[i]);
}
}
