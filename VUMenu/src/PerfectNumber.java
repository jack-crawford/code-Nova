import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the perfect number calculator");
		int input;
		Scanner scan = new Scanner(System.in);

		do {
			
			System.out.print("Enter a number (or 0 to quit): ");
			input = scan.nextInt();
			int sum = 0;
			System.out.println("Factors:");
			for(int i = 1; i < input; i++) {
				if(input%i == 0) {
					System.out.println("\t" + i);
					sum += i;
				}
			}
			System.out.println();
			if (sum == input) 
				System.out.println("This is a perfect number!");
			else if (sum < input)
				System.out.println("This is not a perfect number... it is deficient.");
			else 
				System.out.println("This is not a perfect number... it is abundant.");

		} while (input != 0);
	}

}
