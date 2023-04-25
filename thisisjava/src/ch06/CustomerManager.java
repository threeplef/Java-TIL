package ch06;

import java.util.Scanner;

public class CustomerManager {
	static final int MAX = 100;

	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];

	static int index = -1;
	static int count = 0;

	static Scanner scanner = new Scanner(System.in);

	// 고객 정보 입력
	public static void appendCustomerData() {
		System.out.print("이름: ");
		nameList[count] = scanner.next();
		System.out.print("성별(M/F): ");
		genderList[count] = scanner.next().charAt(0);
		System.out.print("이메일: ");
		emailList[count] = scanner.next();
		System.out.print("출생년도: ");
		birthYearList[count] = scanner.nextInt();
		count++;
	}

	// 고객 정보 출력
	public static void printCustomerInfo() {
		System.out.println("============ CUSTOMER INFO ==============");
		System.out.println("이름: " + nameList[index]);
		System.out.println("성별: " + genderList[index]);
		System.out.println("이메일: " + emailList[index]);
		System.out.println("출생년도: " + birthYearList[index]);
		System.out.println("=======================================");
	}

	// 고객 정보 수정
	public static void updateCustomerInfo() {
		System.out.println("--------- UPDATE CUSTOMER INFO ----------");
		System.out.print("이름(" + nameList[index] + "): ");
		nameList[index] = scanner.next();
		System.out.print("성별(" + genderList[index] + ")	: ");
		genderList[index] = scanner.next().charAt(0);
		System.out.print("이메일(" + emailList[index] + "): ");
		emailList[index] = scanner.next();
		System.out.print("출생년도(" + birthYearList[index] + "): ");
		birthYearList[index] = scanner.nextInt();
	}

	// 고객 정보 삽입
	public static void insertCustomerInfo() {
		for (int i = count - 1; i >= index; i--) {
			nameList[i + 1] = nameList[i];
			genderList[i + 1] = genderList[i];
			emailList[i + 1] = emailList[i];
			birthYearList[i + 1] = birthYearList[i];
		}
		System.out.print("이름: ");
		nameList[index] = scanner.next();
		System.out.print("성별(M/F): ");
		genderList[index] = scanner.next().charAt(0);
		System.out.print("이메일: ");
		emailList[index] = scanner.next();
		System.out.print("출생년도: ");
		birthYearList[index] = scanner.nextInt();
		count++;
	}

	// 고객 정보 삭제
	public static void deleteCustomerData() {
		for (int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			birthYearList[i] = birthYearList[i + 1];
		}
		count--;
	}

	public static void main(String[] args) {
		while (true) {
			System.out.printf("\n[INFO] 고객 수: %d, 인덱스: %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(A)ppend, (P)revious, (N)ext, (C)urrent, (U)pdate, (I)nsert, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scanner.next();
			menu = menu.toLowerCase();

			switch (menu.charAt(0)) {
			case 'a':
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 입력할 수 없습니다.");
				} else {
					appendCustomerData();
					System.out.println("고객 정보를 입력했습니다.");
				}
				break;
			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if (index <= 0) {
					System.out.println("이전 데이터가 없습니다.");
				} else {
					index--;
					printCustomerInfo();
				}
				break;
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if (index >= count - 1) {
					System.out.println("다음 데이터가 없습니다.");
				} else {
					index++;
					printCustomerInfo();
				}
				break;
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if ((index >= 0) && (index < count)) {
					printCustomerInfo();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if ((index >= 0) && (index < count)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerInfo();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'i':
				System.out.println("데이터를 추가합니다.");
				if ((index >= 0) && (index < count)) {
					insertCustomerInfo();
				} else {
					System.out.println("올바른 데이터를 입력해주세요.");
				}

				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if ((index >= 0) && (index < count)) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteCustomerData();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}
		}

	}

}
