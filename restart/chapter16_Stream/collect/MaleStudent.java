package collect;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
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
