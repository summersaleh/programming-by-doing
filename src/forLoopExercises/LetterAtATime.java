package forLoopExercises;

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your message?");
		String message = input.nextLine();
		
		System.out.println("Your message is "+ message.length() + " characters long.");
		System.out.println("The first character is at position " + message.indexOf(message.charAt(0)) + " and is " + message.charAt(0) );
		System.out.println("The last character is at position " + message.indexOf(message.charAt(message.length()-1))+ " and is " + message.charAt(message.length()-1));
		
		System.out.println("Here are all the charaters, one at a time:");
		
		for(int i = 0; i < message.length(); i++){
			System.out.println(i + " - " + message.charAt(i));
		}
		
		
	}

}
