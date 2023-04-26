package ch14;

public class CounterExample {
	public static void main(String[] args) {
		CounterRunner cr = new CounterRunner();
		Thread t1 = new Thread(cr);
		t1.start();

		QuestionRunner qr = new QuestionRunner();
		Thread t2 = new Thread(qr);
		t2.start();
	}

}
