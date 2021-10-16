package localMember;

public class UsingthisExample {
	public static void main(String[] args) {
		UsingThis usingthis = new UsingThis();

		UsingThis.Inner inner = usingthis.new Inner();
		inner.method();
	}
}
