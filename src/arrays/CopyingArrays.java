package arrays;

public class CopyingArrays {

	public static void main(String[] args) {

		int[] array1 = new int[10];
		
		
		System.out.print("Array 1:");
		
		
		for (int i = 0; i < array1.length; i++) {
			int num1 = (int) ((10 * Math.random() + 1) * array1.length);
			array1[i] = num1;
			array1[9] = -7;
			System.out.print("\t" + array1[i]);
		}
		
		
		int[] array2 = new int[10];
		System.out.print("\nArray 2:");
		
		for(int i = 0; i < array2.length; i++) {
		array2[i] = array1[i];
		array2[9] = (int) (10 * Math.random()) + 1;
		System.out.print("\t" + array2[i]);
	}
	}

}
