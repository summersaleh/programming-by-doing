package forLoopExercises;

import java.util.Scanner;

public class CountingMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int count = 0;
		for(int n = 0; n <= count; n++) {
			System.out.println("Count to: ");
			count = input.nextInt();
			System.out.println(n);
		}
	}

}
