package arrays;

public class BasicArrays0 {

	public static void main(String[] args) {

		int[] basic = new int[1000];
		int count = 0;

		for (int i = 0; i < basic.length; i++) {
			int number = (int) (Math.random() * basic.length);
			basic[i] = number;
			System.out.print(basic[i] + "\t");
			count++;
			if (count == 10) {
				System.out.println("\n");
				count = 0;
			}
		}
	}

}
