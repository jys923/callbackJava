package HelloListener3mine;

public class Happen {
 	private	onClickListener monClickListener;
	void setOnClickListener(onClickListener mmonClickListener) {
		monClickListener=mmonClickListener;
	}
	public void doing() {
		monClickListener.onClick();
	}
	public interface onClickListener {
		public void onClick();
	}
}
