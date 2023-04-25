package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("**" + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}

		System.out.println("-------------------------------------------------------");

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%2d ", j, i, i * j);
			}
			System.out.println();
		}

	}

}
