package HelloListener3mine;


public class main {

	public static void main(String[] args) {
		Happen happen = new Happen();
		happen.setOnClickListener(new Happen.onClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("���� �ȳ�~~~");
			}});
		happen.doing();
		 
		Happen2 h2=new Happen2(new Happen2.onClickListener2() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("���� �ȳ�222~~~");
			}});
		h2.work();
	}
}
