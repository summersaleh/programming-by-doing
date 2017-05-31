import java.util.Scanner;

public class MoreUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String name = input.next();
		
		System.out.println("What is your last name?");
		String lastName = input.next();
		
		System.out.println("What is your grade?(9-12)");
		int grade = input.nextInt();
		
		System.out.println("What is your student ID?");
		int id = input.nextInt();
		
		System.out.println("What is your login?");
		String login = input.next();
		
		System.out.println("What is your GPA (0.0 -4.0)?");
		Double gpa = input.nextDouble();
		
		System.out.println("Your information:\n" + "\t Login: "+ login+"\n" + "\t ID: "+ id+ "\n"+ " \t Name: "+ lastName + ", " + name + "\n"+ "\t GPA: "+ gpa + "\n" + "\t Grade: "+ grade);
		
		input.close();
	}

}
