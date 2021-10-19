package stream_review.sec16and11;

import java.util.ArrayList;
import java.util.List;

import collect.Student;

public class MaleStudent {
	/*
			collect(Supplier<R>, BiConsumer<R,? super T> , BiConsumer<R,R>)
			collect(Supplier<R>, ObjIntConsumer<R> , BiConsumer<R,R>)
			collect(Supplier<R>, ObjLongConsumer<R> , BiConsumer<R,R>)
			collect(Supplier<R>, ObjDoubleConsumer<R> , BiConsumer<R,R>)

			Supplier : 는 요소들이 수집될 컨테이너 객체를 생성하는 역할을 한다. 
			~Consumer : 는 컨테이너 객체(R)에 요소(T)를 수집하는 역할을 한다. 스트림에서 요소를 컨테이너에 수집할 때마다 ~~Consumer가 실행된다.
			BiConsumer: 는 컨테이너 객체(R)를 결합하는 역할을 한다. 순차 처리 스트림에서는 호출하지 않고 병렬 처리 스트림에서만 호출되어 쓰레드별로 생성된 컨테이너 객체를 결합해서 최종 컨테이너 객체를 완성한다. 
	*/

	private List<Student> list;

	public MaleStudent(){
		list = new ArrayList<>();
		System.out.println(Thread.currentThread().getName()+"//MaleStudent()");
	}

	public void accumulate(Student stu){
		list.add(stu);
		System.out.println(Thread.currentThread().getName()+"//accumulate()");
	}

	public void combine(MaleStudent other){
		list.addAll(other.getList());
		System.out.println(Thread.currentThread().getName()+"//combine()");
	}



	public List<Student> getList() {
		return this.list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

}
