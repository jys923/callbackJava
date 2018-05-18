package call_back_01;

//public class YoonCaller {
//	YoonCallback yoonCallback = new YoonCallback() {
//		@Override
//		public void yoonCallbackMethod() {
//			// TODO Auto-generated method stub
//			System.out.println("여기 YoonCaller야~~~ call callback method from callee");
//		}		
//	} ;
//	
//	public void doWork() {
//		YoonCallee yoonCallee = new YoonCallee();
//		yoonCallee.setCallback(yoonCallback);
//		yoonCallee.doWork();
//	}
//}

public class YoonCaller implements YoonCallback{

	@Override
	public void yoonCallbackMethod() {
		// TODO Auto-generated method stub
		System.out.println("여기 YoonCaller야~~~ call callback method from callee");
	}
	
	public void doWork() {
		YoonCallee yoonCallee = new YoonCallee();
		//객체를 넘겨줘도 가능 
		//설명은 c 구조체를 생각해보면
		yoonCallee.setCallback(YoonCaller.this);
		yoonCallee.doWork();
	}
}