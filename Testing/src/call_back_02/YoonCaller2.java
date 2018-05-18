//package call_back_02;
//
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

package call_back_02;

public class YoonCaller2 implements YoonCallback{

	@Override
	public void yoonCallbackMethod() {
		// TODO Auto-generated method stub
		System.out.println("여기 YoonCaller2야~~~ call callback method from callee2");
	}
	
	public void doWork() {
		YoonCallee2 yoonCallee2 = new YoonCallee2(this);
		//객체를 넘겨줘도 가능 
		//설명은 c 구조체를 생각해보면
		//yoonCallee2.setCallback(YoonCaller2.this);
		yoonCallee2.doWork();
	}
}