package ch07;

public class InheritanceExample {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 23, "1234567");
		s1.name = "홍길동";
		s1.age = 23;
		s1.studentId = "1234567";
		System.out.println(s1.getDetails());

		Teacher t1 = new Teacher("허준", 30, "국어국문학");
		t1.name = "허준";
		t1.age = 30;
		t1.major = "국어국문학";
		System.out.println(t1.getDetails());
	}
}
