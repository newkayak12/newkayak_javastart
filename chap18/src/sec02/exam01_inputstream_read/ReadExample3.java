package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data ="";
//		
//			while( (readByteNo = is.read(readBytes)) != -1 ) {
//					System.out.println(readByteNo);
//				
//					
//					for(byte piece : readBytes) {
//						System.out.print((char)piece+" ");
//					}
//					
//					System.out.println();
//			}
			
//			3
//			a b c 
//			2
//			d e c  c 가 그대로 남아있네 

			
			
			
			while(true) {
				readByteNo = is.read(readBytes);
					if(readByteNo ==-1) {
						break;
					}
					data += new String(readBytes,0,readByteNo);
					
				}
			System.out.println(data);
			
			
			is.close(); // 이렇게 스트림을 닫아줘야 파일을 다른 곳에서 사용할 수 있게해줌 추가적으로 메모리 누수도 막아줌 
			
	}
}
