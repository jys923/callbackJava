package call_back_01;

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

public class YoonCaller implements YoonCallback{

	@Override
	public void yoonCallbackMethod() {
		// TODO Auto-generated method stub
		System.out.println("���� YoonCaller��~~~ call callback method from callee");
	}
	
	public void doWork() {
		YoonCallee yoonCallee = new YoonCallee();
		//��ü�� �Ѱ��൵ ���� 
		//������ c ����ü�� �����غ���
		yoonCallee.setCallback(YoonCaller.this);
		yoonCallee.doWork();
	}
}