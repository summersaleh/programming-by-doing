package arrays;

public class BasicArrays0 {

	public static void main(String[] args) {

		int[] basic = new int[10];
		basic[0] = (int) (100 * Math.random()) +1;
		basic[1] = (int) (100 * Math.random()) +1;
		basic[2] = (int) (100 * Math.random()) +1;
		basic[3] = (int) (100 * Math.random()) +1;
		basic[4] = (int) (100 * Math.random()) +1;
		basic[5] = (int) (100 * Math.random()) +1;
		basic[6] = (int) (100 * Math.random()) +1;
		basic[7] = (int) (100 * Math.random()) +1;
		basic[8] = (int) (100 * Math.random()) +1;
		basic[9] = (int) (100 * Math.random()) +1;

		for (int i = 0; i < basic.length; i++) {
			System.out.println(basic[i]);
		}
	}

}
