import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			int num = (int) ((5 * Math.random()) + 1) * array.length;
			array[i] = num;
			
		}
	}

}
