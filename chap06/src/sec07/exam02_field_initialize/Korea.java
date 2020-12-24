package sec07.exam02_field_initialize;

public class Korea {
String nation = "korea";
String name, ssn;

//public Korea(String n, String s){   //세미콜론 있으면 안됨 꼭{}로 끝나야
//name = n;
//ssn = s;
//}
//이렇게 쓸 수도 있지만, 매개변수의 값을 필드값으로 설정할 경우 매개변수와 필드명을 동일하게 해준다.
public Korea(String name, String ssn) {
	this.name =name;
	this.ssn =ssn;
}

}
