package pack2;

public class car {
	int distance = 0;
	String color;
	int mileage;
	
	public car() {
		
		mileage = 10;
		System.out.println("The mileage is " +mileage);		
	}
	
	public car(int n) {
		System.out.println("The mileage is " +n);
		
	}
	
	public void getDirection() {
		System.out.println("Your direction is ready.");
	}
	
	public void getDirection(String name) {
		System.out.println("Your direction to " +name+ " is ready.");
	}
	

}
