package sec06.exam09.enumeration_type;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Week today = Week.Sunday;
String name = today.name(); //���⿡ today�� �� �ҹ��ڰ� Week�� �� �빮�ڳ�  ��!.. ��� Week�� today �����߰� �װ� Week.sunday�� ��������
							// �׸��� String ������ü�� name�����ϰ� today ������ .name()�� �����ѰŴϱ� �ҹ��ڰ� ���� 
System.out.println(name);

int ordianl = today.ordinal();
System.out.println(ordianl);
// ��ü, ���, ����, �޼ҵ�, Ŭ���� ���� ����� ���ǰ� Ȯ������ �����ϱ� �����ϱⰡ ��Ƴ�
Week day1 = Week.Monday;
Week day2 = Week.Wednesday;
int result1= day1.compareTo(day2), result2 = day2.compareTo(day1);
System.out.println(result1);
System.out.println(result2);

Week weekDay = Week.valueOf("Sunday"); //Sunday�� ���� ���ڿ��� ���� ������ return
if(weekDay == Week.Sunday || weekDay==Week.Saturday) {// ���� ��� ��ü�� ������ weekDay�� ���� ������ ������?
	System.out.println("�ָ�");
}else {System.out.println("����");
	
}

Week[] days = Week.values();//���� ��ü�� �迭�� return
/*
 * System.out.println(days[0]);
 *  System.out.println(days[6]);
 */


//������ �̰� ��� ���ϱ�? �޷����α׷�?

for(Week day : days) {//for(���ο� ���� : ������ �迭�� ���� �ִ� ����) �׷��� for�� ���鼭 week�� �� ��ġ�� ����// days�� �迭�� ������ for���� ��
	System.out.println(day );
}
	}

}
