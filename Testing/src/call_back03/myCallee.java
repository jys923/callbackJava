package call_back03;

public class myCallee {
	public interface callBack{
		void onClick(int num);
	}
	private callBack calleeCallback;
	
	public void setCallback(callBack calleeCallback) {
		this.calleeCallback = calleeCallback;
	}
	public void doClick() {
		calleeCallback.onClick(0);
	}
}
