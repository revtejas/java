import java.util.Scanner;

public class impl {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String line = s.nextLine();
	System.out.println("Enter line: " + line);
	s.close();
	
	String numbers = "1 3 5 7 9";
	s = new Scanner(numbers);
	while(s.hasNextInt()) {
		System.out.print(s.nextInt());
	}
	
	s.close();
	
	
	

	}

}
