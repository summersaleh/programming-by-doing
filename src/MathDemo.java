import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int count = 0;
		while (count < 4) {
			int random1 = (int) (10 * Math.random()) + 1;
			int random2 = (int) (10 * Math.random()) + 1;
			System.out.println(random1 + "+" + random2 + "= ");
			int answer1 = input.nextInt();
			int solution1 = random1 + random2;
			if (answer1 == solution1) {
				System.out.println("Correct!");
			} else if (answer1 != solution1) {
				System.out.println("Wrong");
			}
			count++;
		}

	}

	public String toString() {
		return null;
	}

}
