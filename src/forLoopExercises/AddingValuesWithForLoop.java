package forLoopExercises;

import java.util.Scanner;

public class AddingValuesWithForLoop {

	public static void main(String[] args) {
		System.out.print("Number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(addValues(number));

	}

	public static String addValues(int number) {
		int count = 0;
		for (int n = 1; n <= number; n++) {
			System.out.println(n);
			count += n;
		}
		return "The sum is " + count;
	}
}
