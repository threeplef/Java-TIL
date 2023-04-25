package ch09;

public class A {
	class B {
		void doIt() {

			System.out.println("A.B");
		}
	}

	static class C {
		void doIt() {
			System.out.println("A.C");
		}
	}

	void doIt() {
		class B {
		}
	}

}
