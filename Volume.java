import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Asks for edges lengths
		System.out.println("What is the length of the first edge?");
		double edge1 = scan.nextDouble();
		System.out.println("What is the length of the second edge?");
		double edge2 = scan.nextDouble();
		System.out.println("What is the length of the third edge?");
		double edge3 = scan.nextDouble();
		
		// Calculates the volume
		double volume = edge1 * edge2 * edge3;
		
		// Print the volume
		System.out.println("The volume of the cuboid is: " + volume);

	}

}
