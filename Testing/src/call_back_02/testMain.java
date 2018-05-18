package call_back_02;

import call_back_01.YoonCaller;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoonCaller yoonCaller = new YoonCaller();
		yoonCaller.doWork();
		
		YoonCaller2 yoonCaller2 = new YoonCaller2();
		yoonCaller2.doWork();
	}
}
