package sec01.exam01_variable; //<line 73에서 옴 _ 메소드를 선언한다는 의미>

public class B_LiteralExample {
 public static void main(String [] args) {
	 int var1=10;
	 	System.out.println(var1); // 10진수 리터럴
	 	
	 	int var2=010;
	 	System.out.println(var2); // 8진수 리터럴
	 	
	 	int var3 =0x1A;
	 	System.out.println(var3); //16진수 리터럴
	 	
	 	double var4=234E5;
	 	System.out.println(var4); // 10진수 지수와 가수
	 	
	 	double var6=2E5;
	 	System.out.println(var6); // 10진수 지수와 가수 2
	 	 	
	 	double var5=0.823;
	 	System.out.println(var5); // 소수
	 	
	 	String lit1="안"; 
	 	
	 	/* public void print(String s) {
	    write(String.valueOf(s));
	}*/ //이거 Declaration에 있던데 이게 String이 클래스라고 했던 의미인가?
	 	
	 	System.out.print(lit1); // char으로 "안"이 출력 안되서 String 으로 바꿔봄
	 	
	 	char lit3='\n'; // 줄바꿈 <carridge return?)
	 	System.out.println(lit3); //역 슬래시가 그냥 '\' 누르면 되는거였음 |가 아니라 (안A로 출력되서 넣어봄 문자는 연달아 넣으면 붙는 성질이 있나봄 분명 코드 내에서 줄을 바꿨는데
	 	
	 	char lit2='A';
	 	System.out.print(lit2); // char이 ""가 아니라 ''라는 것을 발견함
	 	
	 	char lit4='\t';
	 	System.out.println(lit4); // 탭 만큼 띄워라
	 	System.out.println(lit4); // 수평탭이 뭐지? 일부러 해봤는데 안되는건가? 수평탭이랑 수직 탭이랑 무슨 차이인거야..?
	 	
	 	char lit6='\r'; //line feed?
	 	System.out.println(lit6);
	 	
	 	/* 캐리지 리턴 + 라인피드 = 엔터*/
	 	
	 	char lit5='곰';
	 	System.out.println(lit5);	 	
	 	System.out.println(lit5); System.out.print(lit2); System.out.println(lit1);
	 	
		 	
	 	//문자 리터럴 예제를 보고 따라하기 시작 _ 리터럴이 아예 저장된 거네 그냥... 그런 개념인듯?
	 	
	 	System.out.println('\t' + "들여쓰기");
	 	System.out.println('\n' + "줄 바꿈");
	 	System.out.println('\r' + "리턴"); //줄바꾸기나 리턴이나 왜 똑같아 보이지?
	 	System.out.println('\"' + "큰 따옴표와 작은 따옴표" + '\''); //예네들은 프린트아웃에서 사용할 수 있고
	 	
	 	char lit7 = '\uff1f';
	 	System.out.println(lit7);  // 예는 변수 선언할 때 16진수 유니코드를 선언할 수 있네
	 	
	 	
	 	//string이 클래스 타입이라고 하는데, 옛날에 ios 뜯어봤을 때  버전 병이 </string> 3.1.4 <string>인가로 돼있던데 이거랑 연관이 있나?
	 	
	 	System.out.print("대한" + "민국");
	 	
	 	String lit8 ="자바";
	 	
	 	boolean var10 = true;
	 	boolean var11 = false;
	 	System.out.println('\n');
	 	System.out.println(var10);
	 	System.out.println(var11);
	 	
	 	  
	 	
	 	
 }
}
  