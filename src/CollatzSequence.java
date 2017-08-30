import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = 6;
		int count = 0;
		int highest = 0;
		System.out.println("Starting number: " + n);
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				System.out.println(n);
				count++;
				
			} else if (n % 2 == 1) {
				n = (n * 3) + 1;
				System.out.println(n);
				count++;
				
			}
			

		}

		System.out.println("Terminated after " + count + " steps.");
	System.out.println("The largest value was " + highest);
	}

}
