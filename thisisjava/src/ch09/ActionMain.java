package ch09;

public class ActionMain {
	public static void main(String[] args) {
		Button btn1 = new Button("Red");
		Button.ClickListener listener = new Button.ClickListener() {

			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");

			}
		};

		btn1.setListener(new Button.ClickListener() {

			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");

			}
		});

		btn1.setListener(listener);
		btn1.action();
	}
}
