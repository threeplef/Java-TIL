package ch05;

import java.util.Scanner;

public class CoffeeManager {

	static final int MAX = 100;

	static String[] coffeeList = new String[MAX];
	static int[] priceList = new int[MAX];
	static String[] descriptionList = new String[MAX];

	static int index = -1;
	static int count = 0;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.printf("\n[INFO] 메뉴 수: %d, 인덱스: %d\n", count, index);
			System.out.println("원하시는 메뉴를 입력하세요.");
			System.out.println("(A)ppend, (P)revious, (N)ext, (C)urrent, (U)pdate, (I)nsert, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scanner.next();
			menu = menu.toLowerCase();

		}

	}

}
