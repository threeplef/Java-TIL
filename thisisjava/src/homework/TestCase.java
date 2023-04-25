package homework;

import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.println("테스트 케이스 횟수 입력: ");
		int testCase = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < testCase; i++) {
			System.out.println("입력데이터 갯수 입력: ");
			int data = Integer.parseInt(scanner.nextLine());

			for (int j = 1; j < data; j++) {
				System.out.println("데이터 입력: ");
				sum += j;
			}

		}
		System.out.println(sum);
	}

}
