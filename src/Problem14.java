import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	int age;
	int feet;
	int inches;
	double weight;
	
	System.out.println("How old are you?");
	age = keyboard.nextInt();
	
	System.out.println("How many feet tall are you?");
	feet = keyboard.nextInt();
	
	System.out.println("How many inches tall are you?");
	inches = keyboard.nextInt();
	
	System.out.println("How much do you weigh?");
	weight = keyboard.nextDouble();
	
	System.out.println("So, you're " +age+ " years old, " +feet+"'"+inches+" tall and "+weight+" heavy.");
	
	keyboard.close();
	

	}

}
