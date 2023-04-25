package ch06;

import java.util.Scanner;

public class FoodManager2 {
	static final int MAX = 100;
	static Food[] foodList = new Food[MAX];
	static int index = -1;
	static int count = 0;

	static Scanner scanner = new Scanner(System.in);

	private static void insertFood() {
		Food food = new Food();
		System.out.print("식품이름: ");
		food.foodName = scanner.next();
		System.out.print("수량: ");
		food.count = scanner.nextInt();
		System.out.print("유통기한: ");
		food.expDate = scanner.next();
		System.out.print("설명: ");
		food.etc = scanner.next();
		foodList[count++] = food;
	}

	private static void printFoodList() {
		System.out.println("-------------------------------");
		System.out.println("이름\t수량\t유통기한\t설명");
		System.out.println("-------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n", foodList[i].foodName, foodList[i].count, foodList[i].expDate,
					foodList[i].etc);
		}
		System.out.println("-------------------------------");
	}

	private static void updateFoodCount() {
		System.out.print("수정할 식자재 이름을 입력하세요.");
		String food = scanner.next();
		for (int i = 0; i < count; i++) {
			if (foodList[i].foodName.equals(food)) {
				System.out.print("수량을 입력하세요: ");
				int cnt = scanner.nextInt();
				if (cnt == 0) {
					for (int j = i; j < count - 1; j++) {
						foodList[j] = foodList[j + 1];
					}
					count--;
				} else {
					foodList[i].count = cnt;
				}
				return;
			}
		}
		System.out.println("수정할 식자재가 없습니다.");
	}

	private static void deleteFood() {
		System.out.print("삭제할 식자재 이름을 입력하세요:");
		String food = scanner.next();
		for (int i = 0; i < count; i++) {
			if (foodList[i].foodName.equals(food)) {
				for (int j = i; j < count - 1; j++) {
					foodList[j] = foodList[j + 1];
				}
				count--;
				return;
			}
		}
		System.out.println("삭제할 식자재가 없습니다.");
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.추가, 2.목록보기, 3.수정, 4.삭제, 0.종료");
			System.out.println("메뉴:");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("새로운 식자재를 추가합니다.");
				insertFood();
				break;
			case 2:
				System.out.println("식자재 목록을 출력합니다.");
				printFoodList();
				break;
			case 3:
				System.out.println("식자재 목록을 수정합니다.");
				updateFoodCount();
				break;
			case 4:
				System.out.println("식자재 정보를 삭제합니다.");
				deleteFood();
				break;
			case 0:
				System.out.println("식자재 관리 프로그램을 종료합니다.");
				System.exit(0);
				scanner.close();
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
				break;
			}
		}
	}
}
