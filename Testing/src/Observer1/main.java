package Observer1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�̺�Ʈ �߻�
//		CustomView customView.OnDataListener();
		Center center = new Center();   // ������ ������ �� Center Ŭ����
        Sam sam = new Sam(center);      // ���� Sam Ŭ���� ��ü ������ ���ÿ� ������ ���
         
        center.changeInformation("����", "010-2222-3333");
        center.changeInformation("���", "010-1111-7777");
        center.changeInformation("�뱸", "010-9898-2929");


//��ó: http://ssamhouse.tistory.com/entry/JAVA-����������-Observer-Pattern [SSAM's House]
		
	}
}
