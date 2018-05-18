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
    
    // �ݹ� �޼��带 ȣ���� �� �ִ��� Ȯ��
    public void checkCondition() {
        if(m_condition && (m_callback != null)){
        	m_callback.callbackMethod(); // �����ϸ� �ݹ� �޼��� ȣ��
        }
        	//m_callback.callbackMethod(); // �����ϸ� �ݹ� �޼��� ȣ��
    }
}