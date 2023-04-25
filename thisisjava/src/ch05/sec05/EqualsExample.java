package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// 자바의 생성자는 객체를 만드는 용도, 객체 생성시 상태를 초기화 하는 용도
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		s4 = "World";
		System.out.println(s3 == s4);
		s4 = "Hello";
		System.out.println(s3 == s4);

		System.out.println("----------------------------------");

		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}

	}

}
