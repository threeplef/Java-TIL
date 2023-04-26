package ch14;

public class CounterRunner implements Runnable {
	@Override
	public void run() {
		for (int i = 30; i > 0; i--) {
			if (FlagData.isOk) {
				System.out.println("정답-폭탄 해체됨");
				return;
			}
			if (FlagData.isFail) {
				System.out.println("실패");
				break;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("빵");
		System.exit(0);
	}
}
