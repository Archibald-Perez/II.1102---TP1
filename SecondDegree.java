import java.util.Scanner;

public class SecondDegree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Second degree equation solver (ax^2+bx+c)");
		
		// asks for the variables
		System.out.println("What is \'a\'?");
		double a = scan.nextDouble();
		System.out.println("What is \'b\'?");
		double b = scan.nextDouble();
		System.out.println("What is \'c\'?");
		double c = scan.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Every real number is solution.");
				else
					System.out.println("There is no solution.");
			}
			
			else {
				double result = -b/c;
				System.out.println("The solution is: " + result + ".");
			}
		}

		else {
			// Calculates delta
			Double delta = b*b - 4*a*c;
			
			// Finds the solutions
			if (delta < 0) {
				System.out.println("There is no solution.");
			}
			
			if (delta == 0) {
				double result = -b/(2*a);
				System.out.println("The solution is: " + result + ".");
			}
			
			if (delta > 0) {
				double result1 = (-b+Math.sqrt(delta))/(2*a);
				double result2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("The solutions are: " + result1 + " and " + result2 + ".");
			}
		}
	}
}
