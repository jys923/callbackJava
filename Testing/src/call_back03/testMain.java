package call_back03;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCallee callee = new myCallee();
		callee.setCallback(new myCallee.callBack() {
			
			@Override
			public void onClick(int num) {
				// TODO Auto-generated method stub
				System.out.println("���� �ȳ�~~~");
			}
		});
		System.out.println("����");
		callee.doClick();
	}
	
}
