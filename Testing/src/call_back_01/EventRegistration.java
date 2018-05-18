package call_back_01;

//이벤트 등록클래스
public class EventRegistration {
	private CallbackEvent callbackEvent;
	
	//생성자
	public EventRegistration(CallbackEvent event) {
		callbackEvent = event;
	}
	
	public void doWork() {
		callbackEvent.callbackMethod();
	}
}
