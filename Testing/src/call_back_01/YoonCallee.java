package call_back_01;

public class YoonCallee {

	YoonCallback m_callback;
	public void doWork() {
		// TODO Auto-generated method stub
		m_callback.yoonCallbackMethod();
	}
	
	public void setCallback(YoonCallback callback) {
        this.m_callback = callback;
    }
	
}
