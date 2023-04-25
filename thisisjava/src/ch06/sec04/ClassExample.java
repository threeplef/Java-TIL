package ch06.sec04;

public class ClassExample {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		// 클래스명 변수명 = new 생성자();
		System.out.println(p1);
		Pen p2 = new Pen();
		System.out.println(p2);
		System.out.println(p1.color);
		p2.color = "blue";
		System.out.println(p2.color);
		Pen p3 = new Pen("red");
		System.out.println(p3.color);
		p1.write();
		p1.write("Hello");

		System.out.println(p1.sum(1, 2));
//		System.out.println(p1.sum(new int[] { 1, 2, 3, 5 }));
		System.out.println(p1.sum(1, 2, 3, 4, 5)); // 콜러
	}

}
