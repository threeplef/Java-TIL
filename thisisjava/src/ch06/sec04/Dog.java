package ch06.sec04;

public class Dog {
	String name;
	int age;
	static int count;
	static { // 정적 초기화자, static initializer
		// 클래스 로딩 시 1회만 실행
		count = 0;
		Dog d = new Dog("멍멍이", 3);
		d.name = "Hello";
	}
	{ // instance initializer, 인스턴스 초기화자

	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void play() {
		System.out.println(this.name + "이 놀고 있습니다.");
	}

}
