package lifoNfifo.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> conbox = new Stack<>();
		conbox.push(new Coin(100));
		conbox.push(new Coin(200));
		conbox.push(new Coin(500));
		conbox.push(new Coin(1000));
		conbox.push(new Coin(1200));
		conbox.push(new Coin(1400));
		conbox.push(new Coin(100));

		while(!conbox.isEmpty()){
			System.out.println(conbox.pop());
		}
	}
}
