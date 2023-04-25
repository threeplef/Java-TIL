package ch07;

public class VirtualMethodInvocationExample {
	public static void main(String[] args) {
		A a = new B();
		a.doIt();
		a = new C();
		a.doIt();
		C c = (C) a;
		c.doThat();
		A a2 = new A();
		// B b2 = (B) a2;// error
	}
}

class A {
	public void doIt() {
		System.out.println("A");
	}

//	public abstract void doThat();
}

class B extends A {
	public void doIt() {
		System.out.println("B");
	}

//	public void doThat() {}
}

class C extends A {
	public void doThat() {
		System.out.println("C");
	}
}