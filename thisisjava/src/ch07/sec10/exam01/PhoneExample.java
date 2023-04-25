package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

		Phone yrPhone = new SmartPhone("홍길서");
		yrPhone.turnOn();
		yrPhone.internetSearch();
		yrPhone.turnOff();
	}

}
