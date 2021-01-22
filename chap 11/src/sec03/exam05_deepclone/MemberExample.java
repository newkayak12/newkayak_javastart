package sec03.exam05_deepclone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("hong", 25, new int[] {90,90}, new Car("e300"));
		
		System.out.println("ori");
		System.out.println(original.name);
		System.out.println(original.age);
		System.out.print("{");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))? "":",");
		}
		System.out.print("}\n");
		System.out.println(original.car.model);
		
		
		
		Member cloned = original.getMember();
		cloned.scores[0]=100;
		cloned.car.model="R8";
			System.out.println();
			System.out.println("clone");
			System.out.println(cloned.name);
			System.out.println(cloned.age);
			System.out.print("{");
			
			for(int i=0; i<cloned.scores.length; i++) {
				System.out.print(cloned.scores[i]);
				System.out.print((i==(cloned.scores.length-1))? "":",");
				
			}
			System.out.print("}\n");
		System.out.println(cloned.car.model);
		
	}

}
