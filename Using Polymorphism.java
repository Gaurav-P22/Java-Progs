
class Shape
{
	void draw()
	{
	System.out.println("This is Draw");	
	}
	void erase()
	{
		System.out.println("This is Erase");	
	}
}
class Circle extends Shape
{
	void draw()
	{
	System.out.println("This is Circle Draw");	
	}
	void erase()
	{
		System.out.println("This is Circle Erase");	
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("This is Triangle Draw");
	}
	void erase()
	{
		System.out.println("This is Triangle Erase");
	}
	
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("This is Square Draw");
	}
	void erase()
	{
		System.out.println("This is Square Erase");
	}
}

public class Practical6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circle();
		Shape s2=new Triangle();
		Shape s3=new Square();
		s1.draw();
		s1.erase();
		s2.draw();
		s2.erase();
		s3.draw();
		s3.erase();
		new Shape().draw();;
		
	}

}
