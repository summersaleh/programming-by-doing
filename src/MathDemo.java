import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int random1 = (int) (10 * Math.random()) + 1;
		int random2 = (int) (10 * Math.random()) + 1;

		System.out.println(random1 + "+" + random2 + "= ");
		int answer = input.nextInt();
		int solution = random1 + random2;
		int count = 0;
		if (answer == solution) {
			count++;
			System.out.println("Correct!");
		} else if (answer != solution) {
			System.out.println("Wrong");
		}
		
		System.out.println("User got " + count + " correct");
	}

}
