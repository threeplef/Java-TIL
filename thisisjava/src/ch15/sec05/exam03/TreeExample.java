package ch15.sec05.exam03;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class TreeExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("홍길서", 25));
		treeSet.add(new Person("홍길남", 31));
		for (Person p : treeSet) {
			System.out.println(p);
		}

		TreeSet<Cat> catSet = new TreeSet<>();
		catSet.add(new Cat("나비", 1));
		catSet.add(new Cat("너비", 3));
		catSet.add(new Cat("노비", 2));
		for (Cat c : catSet) {
			System.out.println(c);
		}

	}
}

class CatComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.getAge() - o2.getAge();
	}
}

@AllArgsConstructor
@ToString
@Setter
@Getter
class Cat {
	private String name;
	private int age;

}

@AllArgsConstructor
@ToString
@Setter
@Getter
class Person implements Comparable<Person> {
	private String name;
	private int age;

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}
