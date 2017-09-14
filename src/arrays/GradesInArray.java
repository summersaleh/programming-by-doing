package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradesInArray {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		int[] grades = new int[5];

		System.out.print("Name (First Last): ");
		String name = input.nextLine();

		System.out.print("Filename: ");
		String fileName = input.nextLine();

		File file = new File(fileName);
		PrintWriter writer = new PrintWriter(file);

		writer.println(name);

		int count = 1;
		for (int i = 0; i < grades.length; i++) {
			int randomGrades = (int) ((10 * Math.random()) + 1) * grades.length;
			grades[i] = randomGrades;
			System.out.println("Grade " + count + ": " + grades[i]);
			writer.println("Grade " + count + ": " + grades[i]);
			count++;
		}


		writer.close();

	}

}
