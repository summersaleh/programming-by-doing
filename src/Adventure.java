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
				} else if (choice.equalsIgnoreCase("Kitchen")) {
					nextRoom = 3;
				} else {
					System.out.println("Try Again");
				}
			}
			if (nextRoom == 2) {
				System.out.println(
						"As you walk up stairs you hear the creaking of the old wood beneath your feet and old spider webs hit your face. Ew.\nDo you want to go to the \"bedroom\" or the \"attic\" or back down to the \"kitchen\"?");
				System.out.print(">");
				choice = input.nextLine();
				if (choice.equalsIgnoreCase("bedroom")) {
					nextRoom = 4;
				} else if (choice.equalsIgnoreCase("attic")) {
					nextRoom = 5;
				} else {
					System.out.println("Try Again");
				}
			}

			if (nextRoom == 3) {
				System.out.println("You go to the kitchen and make your self a scooby doo sized sandwich");
				System.out.println("");

			}
		}
	}

}
