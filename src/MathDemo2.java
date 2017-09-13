import java.util.Random;
import java.util.Scanner;

public class MathDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random(10);
		System.out.println(r.nextInt(50) + "+" + r.nextInt(50));
		int answer1 = input.nextInt();
		int solution1= 0;
		if (answer1 == solution1) {
			System.out.println("Correct!");
		} else if (answer1 != solution1) {
			System.out.println("Wrong");
		}
		System.out.println(r.nextInt(50) + "+" + r.nextInt(50));
	}

}
