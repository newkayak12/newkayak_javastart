package sec03.exam02_Increase_Decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=10;
		int z;
		System.out.println("---------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		System.out.println("---------------------");
		y--;
		--y;
		System.out.println("y="	+ y);
		
		System.out.println("---------------------");
		z=x++;
		System.out.println("z=+"+z);
		System.out.println("x=" +x);
		System.out.println("---------------------");
		
		z=++x;
		System.out.println("z=+"+z);
		System.out.println("x=" +x);

		System.out.println("---------------------");
		 z=++x + y++;//x=14, y=8  ++x =15 y++ =8, 전체 연산하고 z에 저장하고 +1, 최종적으로 y는 9가 되는거긴 한데 순서가 다름
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		 
		 
		
	}}
