package HelloListener3mine;

public class Happen2 {
	private	onClickListener2 monClickListener;
	public Happen2(onClickListener2 mmonClickListener) {
		monClickListener=mmonClickListener;
		// TODO Auto-generated constructor stub
	}

	public interface onClickListener2 {
		public void onClick();
	}

	public void work() {
		// TODO Auto-generated method stub
		monClickListener.onClick();
	}
}
