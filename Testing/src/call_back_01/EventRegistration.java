package call_back_01;

//�̺�Ʈ ���Ŭ����
public class EventRegistration {
	private CallbackEvent callbackEvent;
	
	//������
	public EventRegistration(CallbackEvent event) {
		callbackEvent = event;
	}
	
	public void doWork() {
		callbackEvent.callbackMethod();
	}
}
