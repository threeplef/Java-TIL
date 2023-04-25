package homework;

import java.util.Scanner;

public class TestCaseAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("테스트 케이스 횟수 입력: ");
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.print("입력데이터 갯수 입력: ");

			int sum = 0;

			int count = scanner.nextInt();
			System.out.print("데이터 입력: ");

			for (int j = 0; j < count; j++) {
				int data = scanner.nextInt();
				sum += data;
			}
			System.out.println("#" + (i + 1) + " " + sum);
		}
		scanner.close();
	}

}
