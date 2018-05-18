package HelloListener2And;

public class main {

	public static void main(String[] args) {
        Event e = new Event();
        e.setOnEventListener(new OnEventListener() {
             public void onEvent(String er) {
                 // do your work.
            	 System.out.print(er);
             }
        });
        e.doEvent();
    }

}
