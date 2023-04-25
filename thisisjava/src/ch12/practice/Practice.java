package ch12.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.StringTokenizer;

public class Practice {
	// 5
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	// 6
	@Override
	public String toString() {
		return id + ": " + name;
	}

	// 8
	public class Example {
		public static void main(String[] args) {
			long start = System.nanoTime();
			int[] scores = new int[1000];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = i;
			}
			int sum = 0;
			for (int score : scores) {
				sum += score;
			}
			double avg = sum / scores.length;
			System.out.println(avg);
			long end = System.nanoTime();
			System.out.println((end - start) + " ns");
		}
	}

	// 10
	public class StringBuilderExample {
		public static void main(String[] args) {
			String str = "";
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= 100; i++) {
				sb.append(i);
			}
			str = sb.toString();
			System.out.println(str);
		}
	}

	// 11

	public class StringTokenizerExample {
		public static void main(String[] args) {
			String str = "아이디,이름,패스워드";
			StringTokenizer st = new StringTokenizer(str, ",");
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				System.out.println(token);
			}
		}
	}

	// 12
	public class IntegerCompareExample {
		public static void main(String[] args) {
			Integer obj1 = 100;
			Integer obj2 = 100;
			Integer obj3 = 300;
			Integer obj4 = 300;
			System.out.println(obj1.equals(obj2));
			System.out.println(obj3.equals(obj4));
		}
	}

	// 15
	public class Example {
		public static void main(String[] args) {
			LocalDateTime startDateTime = LocalDateTime.now();
			LocalDateTime endDateTime = LocalDateTime.of(startDateTime.getYear(), 12, 31, 0, 0, 0);
			long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
			System.out.println("남은 일자: " + remainDay);
		}
	}

	// 16

	public class Example {
		public static void main(String[] args) {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
			System.out.println(sdf.format(now));
		}
	}

}
