public class Cars {

	private int speed;
	private String Model;
	private int price;
	cars(int speed,String Model,int price)
	{
		this.speed=speed;
		this.Model=Model;
		this.price=price;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars cr=new cars(200,"Audi",30000);
		System.out.println("Name: "+cr.getSpeed()+" \nModel:"+cr.getModel()+" \nPrice:"+cr.getPrice());
		

	}

}
