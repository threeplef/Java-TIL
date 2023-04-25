package codingTest;

import java.util.Scanner;

class Janggi {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
//		System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			sc.nextLine();
			String[][] array = new String[N][N];
			for (int line = 0; line < N; line++) {
				String data = sc.nextLine();
				array[line] = data.split(" ");
			}

			int result = 0;
			int px = -1;
			int py = -1;
			outer: for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					if (array[y][x].equals("X")) {
						px = x;
						py = y;
						break outer;
					}
				}
			}

			boolean isJumped = false;
			for (int x = px + 1; x < N; x++) {
				if (array[py][x].equals("L"))
					continue;
				if (array[py][x].equals("Y"))
					break;
				if (array[py][x].equals("H")) {
					if (isJumped) {
						result++;
						break;
					} else {
						isJumped = true;
					}
				}
			}

			isJumped = false;
			for (int x = px - 1; x >= 0; x--) {
				if (array[py][x].equals("L"))
					continue;
				if (array[py][x].equals("Y"))
					break;
				if (array[py][x].equals("H")) {
					if (isJumped) {
						result++;
						break;
					} else {
						isJumped = true;
					}
				}
			}

			isJumped = false;
			for (int y = py + 1; y < N; y++) {
				if (array[y][px].equals("L"))
					continue;
				if (array[y][px].equals("Y"))
					break;
				if (array[y][px].equals("H")) {
					if (isJumped) {
						result++;
						break;
					} else {
						isJumped = true;
					}
				}
			}

			isJumped = false;
			for (int y = py - 1; y >= 0; y--) {
				if (array[y][px].equals("L"))
					continue;
				if (array[y][px].equals("Y"))
					break;
				if (array[y][px].equals("H")) {
					if (isJumped) {
						result++;
						break;
					} else {
						isJumped = true;
					}
				}
			}
			AnswerN = result;
			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}
