package ch16;

public class LamdaExample {
	public static void main(String[] args) {
		action(new MyCalc1());

		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println(x + y);
			}
		});

		action((x, y) -> {
			System.out.println(x + y);
		});
	}

	public static void action(Calculable c) {
		c.calculate(10, 20);
	}

	public static void doIt() {
		System.out.println("doIt");
	}

	public static void doThat() {
		System.out.println("doThat");
	}

}
