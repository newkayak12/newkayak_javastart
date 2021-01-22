package sec05.exam04_getproperty;

import java.util.*;

public class GetPropertyExample {

	public static void main(String[] args) {
//		JVM이 시작할 떄 자동 설정되는 시스템의 속성값을 반환
//		시스템 속성은 key와 값으로 저장 되어있다.
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userhome = System.getProperty("user.home");
//		  ""가 key인데.. 신기하네??
		System.out.println("os : " + osName);
		System.out.println("user name : " + userName);
		System.out.println("user home : " + userhome);
		
		
//		어떤 key들이 있는지 알고 싶다??
//		 collection을 배우면 알수 있는데
//		............................................
		
		System.out.println("=======================");
		System.out.println("[key]   value");
		System.out.println("=======================");
		
		Properties props = System.getProperties();
//		key와 value로 구성된 
//		이게 컬렉션 프레임워크야??
		
		Set keys = props.keySet();
//		set에서 key를 가지고 온다.
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
//			key를 주고 속성값을 받아옴
			System.out.println("["+key+"]" + value);
			
//			사용자의 사용환경을 알고 싶다면....
		}
		
		
	}

}
