package ch07;

public class Student extends Person {
	protected String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.studentId = studentId;
	}

	@Override
	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t학번: " + studentId;
	}
}
