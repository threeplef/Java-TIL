package ch09;

public class Button {
	private String label;

	public Button(String label) {
		this.label = label;
	}

	public void click(int data) {
		class EventHandler {
			void callback() {
				System.out.println(label + "버튼 클릭됨");
				System.out.println("전달된 값: " + data);
			}
		}
		EventHandler e = new EventHandler();
		e.callback();
	}

	private ClickListener listner;

	public void setListener(ClickListener listener) {
		this.listner = listner;
	}

	public static interface ClickListener {
		void onClick();
	}

	public void action() {
		listner.onClick();
	}
}
