package sec03.exam05_deepclone;

import java.util.*;

public class Member implements Cloneable{
	public String  name;
	public int age;
	public int[] scores;
	public Car car;
//	클래스 타입 > 참조타입
	
//	그냥 타입은 얕은복제를 해도 되는데
//	참조타입은 얕은 복제를 하면 번지 값만 복사가 될 뿐이지 실제 참조하고 있는 배열 객체나 클래스 객체는 복제 x
//	thin clone 하면 같은 객체를 참조할 것
	public Member(String name, int age, int[] scores, Car car) {
		this.name=name;
		this.age=age;
		this.scores=scores;
		this.car=car;
		
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
//		얕은 복사를 먼저 한다고 했는데 위 처럼 쓰면 재정의된 녀석을 불러옴
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		
		
	return cloned;
	}
		
	public Member getMember() {
		
		Member cloned = null;
		try {
			cloned = (Member) clone();//overrided
		}catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
