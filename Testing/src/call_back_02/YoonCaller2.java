//package call_back_02;
//
//public class YoonCaller {
//	YoonCallback yoonCallback = new YoonCallback() {
//		@Override
//		public void yoonCallbackMethod() {
//			// TODO Auto-generated method stub
//			System.out.println("���� YoonCaller��~~~ call callback method from callee");
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
		System.out.println("���� YoonCaller2��~~~ call callback method from callee2");
	}
	
	public void doWork() {
		YoonCallee2 yoonCallee2 = new YoonCallee2(this);
		//��ü�� �Ѱ��൵ ���� 
		//������ c ����ü�� �����غ���
		//yoonCallee2.setCallback(YoonCaller2.this);
		yoonCallee2.doWork();
	}
}