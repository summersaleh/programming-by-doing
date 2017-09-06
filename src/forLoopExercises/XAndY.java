package forLoopExercises;

public class XAndY {

	public static void main(String[] args) {

		System.out.println(" X           Y ");
		System.out.println("---------------");
		for(double x = -10; x <= 10; x+=0.5) {
			double y = Math.pow(x, 2);
			System.out.println(x + "     "+ y);
		}
	}

}
