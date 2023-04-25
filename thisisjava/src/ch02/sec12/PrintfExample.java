package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

		// 형식 문자에 d, f, s 외에도 c(문자), t(날짜/시간) 도 있음
		// arg_index$는 형식 문자에 매핑되는 변수의 순서를 지정함
		System.out.println();
		java.util.Date d = new java.util.Date();
		System.out.printf("%ty \n", d); // 연도 출력
		// 연-월-일을 출력하려면?
		System.out.printf("%ty-%tm-%td \n", d, d, d);
//		System.out.printf("%ty-%tm-%td \n", d); // 에러
		System.out.printf("%1$ty-%1$tm-%1$td \n", d);
	}

}
