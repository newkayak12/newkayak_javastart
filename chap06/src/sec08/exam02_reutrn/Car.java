package sec08.exam02_reutrn;

public class Car {
 int gas;
 
 void setGas(int gas) {
	 this.gas=gas; //this.gas는 필드에 있는 gas
	 
 }
 
 boolean isLeftGas() {
	 
	 if(gas == 0) {
		 System.out.println("연료가 없습니다.");
	 return false;
	 } 
	 System.out.println("연료가 있습니다.");
	 return true; //if 내용 안에 있으면 false를 그 조건 만족하지 않으면 밖에 있는 true를
 }
 
 
 void run() {
	 while(true) {//if you want finish this 'whileSyntax',  break or return must be exist
		if(gas>0) {
			System.out.println("주행 중 입니다.(잔량 :" + gas + ")");
			gas--;
		} else {
			System.out.println("정차 합니다.(잔량 :" + gas + ")");
			break; // or return
		}
	 }
 }
}
