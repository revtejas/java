import java.util.Scanner;
public class switchintro
{
public static void main (String args[])
{
	Scanner s = new Scanner(System.in);
	int a,b;
	System.out.println("Enter value of a and b: ");
	a = s.nextInt();
	b = s.nextInt();
	
	System.out.println("Enter 1.add 2.sub 3.multiply ");
	int n;
	n = s.nextInt();
	
	switch(n) {
	
	case 1 : System.out.println("Addition of a and b is: " + (a+b));
				break;
		
	case 2 : System.out.println("Subtraction of a and b is: " + (a-b));
				break;
	
	case 3 : System.out.println("Multiplication of a and b is: " + (a*b));
				break;
		
	//default : System.out.println("Wrong input choice. ");
	}
}
}


