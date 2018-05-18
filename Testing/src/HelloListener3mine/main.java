package HelloListener3mine;


public class main {

	public static void main(String[] args) {
		Happen happen = new Happen();
		happen.setOnClickListener(new Happen.onClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("µåµð¾î ¾È³ç~~~");
			}});
		happen.doing();
		 
		Happen2 h2=new Happen2(new Happen2.onClickListener2() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("µåµð¾î ¾È³ç222~~~");
			}});
		h2.work();
	}
}
