package call_back_01;

class Callee {
    
    private boolean m_condition;
    private Callback m_callback;
    
    public Callee() {
        m_condition = false;
        m_callback = null;
    }
    
    public void setCallback(Callback callback) {
        this.m_callback = callback;
    }
    
    // 콜백 메서드를 호출할 수 있는지 확인
    public void checkCondition() {
        if(m_condition && (m_callback != null)){
        	m_callback.callbackMethod(); // 가능하면 콜백 메서드 호출
        }
        	//m_callback.callbackMethod(); // 가능하면 콜백 메서드 호출
    }
}