package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingAValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] value = new int[10];
		System.out.print("Array: ");
		for (int i = 0; i < value.length; i++) {
			int num = (int) ((50 * Math.random()) + 1) * value.length;
			value[i] = num;
			System.out.print("\t" + value[i]);
		}
		System.out.print("\nValue to find: ");

		int find = input.nextInt();

		for (int i = 0; i < value.length; i++) {
			if (value[i] == find) {
				System.out.println(find + " is in the array");
			}
		}

	}
}
