package ch05;

public class MemoryExample {

	public static void main(String[] args) {
		int number = 10;
		Pen p1 = new Pen("검정색");
		Pen p2 = new Pen("검정색");
		System.out.println(p1 == p2);
		Pen p3 = p1;
		System.out.println(p1 == p3);
	}

} // end class

class Pen {

	public final String BAND = "모나미"; // 상수
	public static int count = 0; // 정적필드 (static field)
	public String color; // 인스턴스 필드

	public Pen(String color) { // 생성자, constructor
		this.color = color;
	}

	public void write() { // 메소드 코드
		System.out.println("Hello");
	}
}
