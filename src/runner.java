import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// Create objects
		Scanner in = new Scanner(System.in);
		calculator calc = new calculator();
		
		// Get user input
		System.out.print("A Value: ");
		calc.setA(in.nextInt());
				
		System.out.print("B Value: ");
		calc.setB(in.nextInt());
				
		
		System.out.println(calc.division());
	}

}
