package forLoopExercises;

import java.util.Scanner;

public class CountingMachineRevisited {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int by = 0;
		int to = 0;
		int count = 0;
		System.out.print("Count from: ");
		int from = input.nextInt();
		System.out.print("Count to: ");
		to = input.nextInt();
		System.out.print("Count by: ");
		by = input.nextInt();
		for (;from <= to; from += by) {
			System.out.println(from);
		}
	}

}
