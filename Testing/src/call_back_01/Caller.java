/*package call_back_01;

class Caller {
    
    private Callee callee;
    private int value;
	
	public static void main(String[] args) {
    
		Callback callback = new Callback() {
            @Override
            public void callbackMethod() {
                // �̰��� �ݹ� �޼��忡�� ������ ���� (�� ����, ����...)
            	System.out.println("call callback method from callee");
            }
		};
	Callee a = new Callee();
	a.setCallback(callback);
	a.checkCondition();
    }
}
*/