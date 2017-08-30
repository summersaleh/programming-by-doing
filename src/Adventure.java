import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int nextRoom = 1;
		String choice = "";

		while (nextRoom != 0) {
			if (nextRoom == 1) {
				System.out.println(
						"You are in a creepy mansion and must try to get out.....alive!\nWould you like to go \"upstairs\" or into the \"kitchen\"? ");
				System.out.print(">");
				choice = input.nextLine();
				if (choice.equalsIgnoreCase("Upstairs")) {
					nextRoom = 2;
				} else if(choice.equalsIgnoreCase("Kitchen")) {
					nextRoom = 3;
				} else {
					System.out.println("Try Again");
				}
			}
		}
	}

}
