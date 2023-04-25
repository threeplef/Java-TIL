package ch04.practice;

import java.util.Scanner;

public class PracticeCode {

	public static void main(String[] args) {
		// 3
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 총합: " + sum);

		System.out.println("-----------------------");

		// 4

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5) {
				break;
			}
		}

		System.out.println("-----------------------");

		// 5
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}

		System.out.println("-----------------------");

		// 6-1
		int row1 = 5;
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		// 6-2
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		// 6-3
		for (int i = 0; i < 5; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		// 7
		boolean run = true;
		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------");
			System.out.println("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());

				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
