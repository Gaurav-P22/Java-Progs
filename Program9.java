package Unit2;

class  Number
{
	private double a=153;
	boolean isZero()
	{
		if(a==0)
		{
			return true;
		}
		return false;
	}
	boolean isPositive()
	{
		if(a>0)
		{
			return true;
		}
		return false;
	}
	boolean isNegative()
	{
		if(a<0)
		{
			return true;
		}
		return false;
	}
	boolean isOdd()
	{
		if(a%2!=0)
			return true;
	return false;
	}
	boolean isEven()
	{
		if(a%2==0)
		{
			return true;
		}
		return false;
	}
	boolean isPrime()
	{
		int i;
		for(i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	boolean isArmstrong()
	{
		int temp,c = 0,last,sum=0;
		temp =(int)a;
		while(temp!=0)
		{
			
			temp=temp/10;
			c++;
		}
		temp =(int)a;
		while(temp!=0)
		{
			last=temp%10;
			sum=(int) (sum+Math.pow(last, c));			
		temp=temp/10;
		
		}
		if(sum==a)
		{
			return true;
		}
		return false;
		
	}
	
	
}
public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Number n1=new Number();
 System.out.println(n1.isArmstrong());
 System.out.println(n1.isArmstrong());
 System.out.println(n1.isArmstrong());
 System.out.println(n1.isArmstrong());
	}

}
