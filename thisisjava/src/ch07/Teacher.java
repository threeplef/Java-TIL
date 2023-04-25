package ch07;

public class Teacher extends Person {
	protected String major;

	public Teacher(String name, int age, String major) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.major = major;
	}

	@Override
	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t전공: " + major;
	}
}
