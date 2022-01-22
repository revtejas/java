public class car1 {
	int distance = 0;
	String color;
	int mileage;
	
	public car1() {
		
		mileage = 10;
		System.out.println("The mileage is " +mileage);		
	}
	
	public car1(int n) {
		System.out.println("The mileage is " +n);
		
	}
	
	public void getDirection() {
		System.out.println("Your direction is ready.");
	}
	
	public void getDirection(String name) {
		System.out.println("Your direction to " +name+ " is ready.");
		
	}
	

}
