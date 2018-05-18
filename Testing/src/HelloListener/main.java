package HelloListener;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initiater initiater = new Initiater();
        //Responder responder = new Responder();
        //initiater.addListener(responder);

		Initiater initiater = new Initiater();
        initiater.addListener(new Responder());

        initiater.sayHello();  // 누가 "Hello!!"라고 하면 다른 객체들이 "Hello there..."이라고 대답한다. 
	}

}
