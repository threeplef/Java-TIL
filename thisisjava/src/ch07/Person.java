package ch07;

public class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getDetails() {
		return "이름" + name + "\t나이: " + age;
	}
}
