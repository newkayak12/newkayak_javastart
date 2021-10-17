package functionalInterfaceApi.andThen_Compose.function_andThenCompose;

import java.util.function.Function;

import functionalInterfaceApi.andThen_Compose.consumer_andThen.Address;
import functionalInterfaceApi.andThen_Compose.consumer_andThen.Member;

public class FunctionalAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member,Address> functionA;
		Function<Address,String> functionB;
		Function<Member,String> functionC;
		String city;


		functionA = m->m.getAddress();
		functionB = a->a.getCity();

		functionC = functionA.andThen(functionB);
		city = functionC.apply(
			new Member("kim","yj", new Address("korea", "seoul"))
		);

		System.out.println("home town "+city);

		functionC = functionB.compose(functionA);
		city=functionC.apply(
			new Member("kim","yj", new Address("korea", "seoul"))
		);

		System.out.println("home town "+city);
	}
}
