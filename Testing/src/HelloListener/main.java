package HelloListener;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initiater initiater = new Initiater();
        //Responder responder = new Responder();
        //initiater.addListener(responder);

		Initiater initiater = new Initiater();
        initiater.addListener(new Responder());

        initiater.sayHello();  // ���� "Hello!!"��� �ϸ� �ٸ� ��ü���� "Hello there..."�̶�� ����Ѵ�. 
	}

}
