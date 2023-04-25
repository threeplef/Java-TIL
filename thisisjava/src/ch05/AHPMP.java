package ch05;

import java.util.Scanner;

// Animal Hospital Patient Management Program
public class AHPMP {

	static final int MAX = 100;
	static final String[] possibleSpeciesList = { "CAT", "DOG" };

	static String[] partnerNameList = new String[MAX]; // 주인 이름
	static String[] partnerContactList = new String[MAX]; // 주인 연락

	static String[] nameList = new String[MAX];// 이름 저장
	static char[] sexList = new char[MAX];// 성별 저장
	static char[] cutList = new char[MAX]; // 중성화 여부 저장
	static String[] speciesList = new String[MAX]; // 종 저장
	static int[] weightList = new int[MAX]; // 몸무게 저장
	static int[] bornYearList = new int[MAX];// 출생년도 저장
	static String resultSpecies = null;
	static String resultPatient = null;
	// Patient

	static int aIndex = -1;
	static int aCount = 0;
	static Scanner scanner = new Scanner(System.in);

	// section a
	// ======================================================================
	// 환자 추가 맨 뒤에 그냥 추가
	private static void appendPatient() {
		System.out.print("주인님 이름을 입력해 주세요 > ");
		String patnerName = scanner.next();

		System.out.print("주인님 연락처 입력해 주세요 > ");
		String partnerContact = scanner.next();

		System.out.print("환자 이름을 입력해 주세요 >");
		String name = scanner.next();
		scanner.nextLine();

		System.out.print("환자 성별을 입력해 주세요(M/F) >");
		char sex = scanner.next().charAt(0);

		System.out.print("중성화 여부를 입력해 주세요(N/Y) >");
		char cut = scanner.next().charAt(0);

		// 종 입력

		System.out.println("진료 가능 종입니다. >");
		for (int i = 0; i < possibleSpeciesList.length; i++) {
			System.out.print(possibleSpeciesList[i] + " ");
		}
		System.out.println();
		System.out.println("종을 입력해 주세요 >");

		String iputSpecies = scanner.next();
		// scanner.nextLine();

		System.out.println("입력 값: " + iputSpecies);
		for (int i = 0; i < possibleSpeciesList.length; i++) {
			if (possibleSpeciesList[i].equals(iputSpecies)) {

				resultSpecies = possibleSpeciesList[i];
			}
		}

		if (resultSpecies == null) {
			System.out.println("진료 가능한 종이 아닙니다. ");
			System.exit(0);
		} // 종 입력

		System.out.print("몸무게를 정수로 입력해주세요 >");
		int weight = scanner.nextInt();

		System.out.print("출생년도를 4자리로 입력해주세요 >");
		int bornYear = scanner.nextInt();

		partnerNameList[aCount] = patnerName;
		partnerContactList[aCount] = partnerContact;
		nameList[aCount] = name;
		sexList[aCount] = sex;
		cutList[aCount] = cut;
		speciesList[aCount] = resultSpecies;
		weightList[aCount] = weight;
		bornYearList[aCount] = bornYear;
		aCount++;
	} // appendPatient 종료

	// 환자 삽입 삽!!!!!!!!!!!!!!!!!! 입!!!!!!!!!!!!!!! 인덱스 찾아!!!!
	private static void insertPatient() {
		System.out.println("삽입할 인덱스를 입력해주세요 >");
		int aIndex = scanner.nextInt();

		System.out.println("주인님 이름을 입력해 주세요 > ");
		String patnerName = scanner.next();

		System.out.println("주인님 연락처 입력해 주세요 > ");
		String partnerContact = scanner.next();

		System.out.print("환자 이름을 입력해 주세요 >");
		String name = scanner.next();

		System.out.print("환자 성별을 입력해 주세요(M/F) >");
		char sex = scanner.next().charAt(0);

		System.out.print("중성화 여부를 입력해 주세요(N/Y) >");
		char cut = scanner.next().charAt(0);
		// 종 입력

		System.out.print("진료 가능 종입니다. >");
		for (int i = 0; i < possibleSpeciesList.length; i++) {
			System.out.print(possibleSpeciesList[i] + " ");
		}
		System.out.println();
		System.out.print("종을 입력해 주세요 >");

		String iputSpecies = scanner.next();
		// scanner.nextLine();

		System.out.print("입력 값: " + iputSpecies);
		for (int i = 0; i < possibleSpeciesList.length; i++) {
			if (possibleSpeciesList[i].equals(iputSpecies)) {

				resultSpecies = possibleSpeciesList[i];
			}
		}

		if (resultSpecies == null) {
			System.out.println("진료 가능한 종이 아닙니다. ");
			System.exit(0);
		} // 종 입력

		System.out.print("몸무게를 정수로 입력해주세요 >");
		int weight = scanner.nextInt();

		System.out.print("출생년도를 4자리로 입력해주세요 >");
		int bornYear = scanner.nextInt();

		for (int i = aIndex; i < aCount - 1; i++) {
			partnerNameList[i + 1] = partnerNameList[i];
			partnerContactList[i + 1] = partnerContactList[i];
			nameList[i + 1] = nameList[i];
			sexList[i + 1] = sexList[i];
			cutList[i + 1] = cutList[i];
			speciesList[i + 1] = speciesList[i];
			weightList[i + 1] = weightList[i];
			bornYearList[i + 1] = bornYearList[i];
		}

		partnerNameList[aIndex] = patnerName;
		partnerContactList[aIndex] = partnerContact;
		nameList[aIndex] = name;
		sexList[aIndex] = sex;
		cutList[aIndex] = cut;
		speciesList[aIndex] = resultSpecies;
		weightList[aIndex] = weight;
		bornYearList[aIndex] = bornYear;

		aCount++;
	}// insertPation 종료

	// 환자 수정
	private static void updatePatient() {
		System.out.println("정보를 수정할 환자의 이름을 입력해주세요: ");
		String patientName = scanner.next();
		for (int i = 0; i < nameList.length - 1; i++) {
			if (patientName.equals(nameList[i])) {
				resultPatient = nameList[i];
				System.out.println("--------- 수정할 환자 정보 ----------");
				System.out.print("이름(before: " + nameList[i] + ")> ");
				nameList[i] = scanner.next();
				System.out.print("성별(before: " + sexList[i] + ")> ");
				sexList[i] = scanner.next().charAt(0);
				System.out.print("중성화 여부(before: " + cutList[i] + ")> ");
				cutList[i] = scanner.next().charAt(0);
				System.out.print("종(before: " + speciesList[i] + ")> ");
				for (int j = 0; j < possibleSpeciesList.length - 1; j++) {
					if (scanner.next().equals(possibleSpeciesList[j])) {
						resultSpecies = possibleSpeciesList[j];
						speciesList[i] = scanner.next();
					}
				}
				if (resultSpecies == null) {
					System.out.println("진료 가능한 종이 아닙니다. ");
					System.exit(0);
				}

				System.out.print("몸무게(before: " + weightList[i] + ")> ");
				weightList[i] = scanner.nextInt();
				System.out.print("출생년도(before: " + bornYearList[i] + ")> ");
				bornYearList[i] = scanner.nextInt();
			}

		}
	}

	// 환자 검색 # 이름으로
	private static void searchPatientWithName() {
		System.out.println("환자 이름을 입력해주세요. > ");
		String patientName = scanner.next();
		for (int i = 0; i < nameList.length - 1; i++) {
			if (patientName.equals(nameList[i])) {
				resultPatient = nameList[i];
				System.out.println("=============== 환자 정보 ===============");
				System.out.println("이름: " + nameList[i]);
				System.out.println("성별: " + sexList[i]);
				System.out.println("중성화 여부: " + cutList[i]);
				System.out.println("종: " + speciesList[i]);
				System.out.println("몸무: " + weightList[i]);
				System.out.println("출생년도: " + bornYearList[i]);
				System.out.println("=======================================");
			}
		}
		if (resultPatient == null) {
			System.out.println("환자 정보가 없습니다.");
			System.exit(0);
		}
	}

	// 환자 삭제
	private static void deletePatient() {
		System.out.println("삭제할 환자 이름을 입력해주세요. > ");
		String patientName = scanner.next();
		for (int i = 0; i < nameList.length - 1; i++) {
			if (patientName.equals(nameList[i])) {
				nameList[i] = nameList[i + 1];
				sexList[i] = sexList[i + 1];
				cutList[i] = cutList[i + 1];
				speciesList[i] = speciesList[i + 1];
				weightList[i] = weightList[i + 1];
				bornYearList[i] = bornYearList[i + 1];
			}

		}
		aCount--;
	}

	public static void main(String[] args) {
		System.out.println("동물 병원 환자 관리 프로그램 입니다. ");
		while (true) {
			System.out.printf("\n환자 수: %d, 인덱스: %d\n ", aCount, aIndex);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(A)ppend, (I)nsert, (S)earch " + ", (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scanner.next();
			menu = menu.toLowerCase(); // 입력한 문자열을 소문자로 변환

			switch (menu.charAt(0)) {
			case 'a':
				appendPatient();
				break;
			case 'i':
				insertPatient();
				break;
			case 's':
				searchPatientWithName();
				break;
			case 'u':
				System.out.println("회원 정보를 수정합니다.");
				updatePatient();
				break;
			case 'd':
				System.out.println("회원 정보를 삭제합니다.");
				deletePatient();
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				System.exit(0);

			}
		}

	}

}
