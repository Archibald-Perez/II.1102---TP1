import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("What is your name?");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello " + name + ".");

	}

}
