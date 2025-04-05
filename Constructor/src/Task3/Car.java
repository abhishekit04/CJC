package Task3;

public class Car {
	
	String colour ;
	int price;
	
	public Car (String colour , int price)
	{
		this.colour = colour;
		this.price = price;
	}
	
	public static void main(String args[])
	{
		Car a = new Car("Blue" , 450000);
		
		System.out.println(a.price);
		System.out.println(a.colour);
	}
	

}


