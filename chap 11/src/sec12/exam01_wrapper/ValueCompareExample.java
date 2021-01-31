package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		System.out.println("\n-128~127 사이의 값이 아닌 값일 경우");
		Integer obj1 = 300;
		Integer obj2  = 300;
		System.out.println((obj1==obj2));
		//번지비교... 과연 같은 객체???? > 자동 박싱이 만들어지고 새로운 Integer객체가 만들어지고 그 안에 값이 들어가는 것
//		> 다른 번지겠지 당연히 
		
		
		System.out.println("\n-128~127 사이의 값일 경우 	");
		Integer obj3 =10;
		Integer obj4  = 10;
		System.out.println((obj3==obj4));
		
		
//		이 둘의 차이는???????? 
//		==의 연산자를 사용했을 떄 값이 언제는 true, 언제는 false...
//		값을 얻어내서 비교(==)하거나 /equals메소드를 사용
		System.out.println("unboxing");
		System.out.println(("obj1,obj2  "+( obj1.intValue() == obj2.intValue())));
		System.out.println(("obj3,obj4  "+(obj3.intValue()	== obj4.intValue())));
		System.out.println("wrapper가 가진 equlas 사용");
		System.out.println("obj1,obj2  "+(obj1.equals(obj2)));
		System.out.println("obj3,obj4  "+(obj3.equals(obj4)));
		
		
		
	}

}
