package sec04.exam01_field;

public class UsingThis {
		
		public int field = 10;
		
		class Inner{
				int field = 20;
				
				
					void method() {
							Functional fi = () -> {
								
									System.out.println("outter : "+ UsingThis.this.field);
//									바깥 쪽을 부를 떄. 클래.this
									
									System.out.println("inner : " +  this.field);
//									그냥 this는 안 쪽 것...
									
							};
							
						fi.method();
				}
			
			
		}

}
