package HelloListener2And;

public class Event {
    private OnEventListener mOnEventListener;

    public void setOnEventListener(OnEventListener listener) {
        mOnEventListener = listener;
    }

    public void doEvent() {
        /*
         * code code code
         */

         // and in the end

         String s = null ;
		if (mOnEventListener != null)
        	  s ="aaa"; 
             mOnEventListener.onEvent(s); // event result object :)
    }
}
