package ch08;

public class HelloProxy extends Hello {
	@Override
	public void sayHello(String name) {
		HelloLog.log();
		super.sayHello(name);
	}
}
