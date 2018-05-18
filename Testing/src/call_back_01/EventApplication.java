package call_back_01;

//�ݹ��Լ� ���Ŭ����
public class EventApplication 
{
	public static void main(String[] args) {
	
	//�̺�Ʈ �����ϸ鼭 new�ϸ� �������̽� �ν��Ͻ�ȭ ����
	CallbackEvent callbackEvent = new CallbackEvent() {
		@Override
		public void callbackMethod() {
			System.out.println("call callback method from callee");
		}
	};
	
	//�̺�Ʈ ���
	EventRegistration eventRegistration = new EventRegistration(callbackEvent);
	
	//�޼��� ��
	eventRegistration.doWork();
	
	Callback callback = new Callback() {
		@Override
		public void callbackMethod() {
			// TODO Auto-generated method stub
			System.out.println("2nd call callback method from callee");
		}
	};
	
	Callee callee = new Callee();
	//���
	callee.setCallback(callback);
	callee.checkCondition();
	
	YoonCaller yoonCaller = new YoonCaller();
	yoonCaller.doWork();
	
	}
}
