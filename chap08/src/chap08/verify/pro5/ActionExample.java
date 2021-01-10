package chap08.verify.pro5;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("Do copy");
			}
		};
		action.work();
	}

}
