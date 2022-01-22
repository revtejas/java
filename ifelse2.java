import java.util.Scanner;
public class ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = s.nextInt();
		
		System.out.println("Enter weight: ");
		int wt = s.nextInt();
		
		if(age>18) {
			if(wt>45) {
				System.out.println("okay, 2 dose vaccination allowed.");
			}
			else if(wt>60){
				System.out.println("only 1 dose vaccincation allowed.");
			}
			else {
				System.out.println("Go home, you're underweight.");
			}
		}
		else {
			System.out.println("No vaccination. Go home.");
		}
		

	}

}
