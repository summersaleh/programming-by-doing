package forLoopExercises;

import java.util.Scanner;

public class CountingForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in a message, and i'll display it five times.");
		System.out.println("Message: ");
		String message = input.nextLine();
		
		for(int count = 1; count <= 5; count++) {
			System.out.println(count + ". " + message);
		}
		
		input.close();
	}

}
