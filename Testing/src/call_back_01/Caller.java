/*package call_back_01;

class Caller {
    
    private Callee callee;
    private int value;
	
	public static void main(String[] args) {
    
		Callback callback = new Callback() {
            @Override
            public void callbackMethod() {
                // 이곳에 콜백 메서드에서 할일을 구현 (값 전달, 복사...)
            	System.out.println("call callback method from callee");
            }
		};
	Callee a = new Callee();
	a.setCallback(callback);
	a.checkCondition();
    }
}
*/