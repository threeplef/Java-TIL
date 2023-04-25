package ch08.sec01;

public class CastingExample {
	public static void main(String[] args) {
		A a = new B();
		a.doIt();
		B b = (B) a;
		b.doThat();
	}

}

interface A {
	void doIt();
}

class B implements A {
	@Override
	public void doIt() {
		System.out.println("B.doIt");
	}

	public void doThat() {
		System.out.println("B.doThat");
	}
}