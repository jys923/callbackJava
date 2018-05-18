package call_back_02;

public class YoonCallee2 {

	YoonCallback m_callback;
	public void doWork() {
		// TODO Auto-generated method stub
		m_callback.yoonCallbackMethod();
	}
	
	YoonCallee2(YoonCallback callback) {
        this.m_callback = callback;
    }
	
}
