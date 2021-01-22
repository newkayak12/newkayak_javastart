package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {

		Counter counter = null;
		for(int i = 1 ; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
//			객체가 만들어지자 마자 쓰레기로 만듬
//		gc는 메모리가 부족하고 cpu가 한가할 때...
			System.gc();
//			대부분의 경우는 gc가 실행 됨.. 이 메소드를 부르면 
		}
		
		
		
//		보시다시피 순서는 자기 마음대로....
		/*
		 *
 2번 객체의 finalize()가 실행 됨
1번 객체의 finalize()가 실행 됨
3번 객체의 finalize()가 실행 됨
10번 객체의 finalize()가 실행 됨
16번 객체의 finalize()가 실행 됨
20번 객체의 finalize()가 실행 됨
23번 객체의 finalize()가 실행 됨
27번 객체의 finalize()가 실행 됨
31번 객체의 finalize()가 실행 됨
36번 객체의 finalize()가 실행 됨
39번 객체의 finalize()가 실행 됨
38번 객체의 finalize()가 실행 됨
43번 객체의 finalize()가 실행 됨
48번 객체의 finalize()가 실행 됨
50번 객체의 finalize()가 실행 됨
49번 객체의 finalize()가 실행 됨
47번 객체의 finalize()가 실행 됨
46번 객체의 finalize()가 실행 됨
44번 객체의 finalize()가 실행 됨
45번 객체의 finalize()가 실행 됨
42번 객체의 finalize()가 실행 됨
40번 객체의 finalize()가 실행 됨
41번 객체의 finalize()가 실행 됨
37번 객체의 finalize()가 실행 됨
33번 객체의 finalize()가 실행 됨
34번 객체의 finalize()가 실행 됨
35번 객체의 finalize()가 실행 됨
32번 객체의 finalize()가 실행 됨
30번 객체의 finalize()가 실행 됨
29번 객체의 finalize()가 실행 됨
28번 객체의 finalize()가 실행 됨
25번 객체의 finalize()가 실행 됨
26번 객체의 finalize()가 실행 됨
24번 객체의 finalize()가 실행 됨
22번 객체의 finalize()가 실행 됨
21번 객체의 finalize()가 실행 됨
19번 객체의 finalize()가 실행 됨
18번 객체의 finalize()가 실행 됨
17번 객체의 finalize()가 실행 됨
14번 객체의 finalize()가 실행 됨
15번 객체의 finalize()가 실행 됨
13번 객체의 finalize()가 실행 됨
11번 객체의 finalize()가 실행 됨
12번 객체의 finalize()가 실행 됨
9번 객체의 finalize()가 실행 됨
8번 객체의 finalize()가 실행 됨
7번 객체의 finalize()가 실행 됨
4번 객체의 finalize()가 실행 됨
5번 객체의 finalize()가 실행 됨
6번 객체의 finalize()가 실행 됨
		 */
		
	}

}
