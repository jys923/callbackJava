package call_back_01;

//콜백함수 사용클래스
public class EventApplication 
{
	public static void main(String[] args) {
	
	//이벤트 구현하면서 new하면 인터페이스 인스턴스화 가능
	CallbackEvent callbackEvent = new CallbackEvent() {
		@Override
		public void callbackMethod() {
			System.out.println("call callback method from callee");
		}
	};
	
	//이벤트 등록
	EventRegistration eventRegistration = new EventRegistration(callbackEvent);
	
	//메서드 콜
	eventRegistration.doWork();
	
	Callback callback = new Callback() {
		@Override
		public void callbackMethod() {
			// TODO Auto-generated method stub
			System.out.println("2nd call callback method from callee");
		}
	};
	
	Callee callee = new Callee();
	//등록
	callee.setCallback(callback);
	callee.checkCondition();
	
	YoonCaller yoonCaller = new YoonCaller();
	yoonCaller.doWork();
	
	}
}
