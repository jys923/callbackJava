package Observer2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer mcJDM = new Singer(); // ���� ź��

		// �� ����
		SingerFan person1 = new SingerFan("�Ϲ���1");
		SingerFan person2 = new SingerFan("�Ϲ���2");

		// ������ ���� �ҵ��� �޶����
		mcJDM.addFan(person1);
		mcJDM.addFan(person2);

		mcJDM.speak(); // ������ ���� �մϴ�.

		// �� �Ѹ��� ������ ���� �Ⱦ��ؼ� Ż���մϴ�.
		mcJDM.deleteFan(person2);

		// ���ο� ���� �Ǳ�� ����մϴ�.
		SingerFan person3 = new SingerFan("�Ϲ���3");
		mcJDM.addFan(person3);

		mcJDM.speak(); // ������ ���� �մϴ�.
	}

}
