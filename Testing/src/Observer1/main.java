package Observer1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이벤트 발생
//		CustomView customView.OnDataListener();
		Center center = new Center();   // 정보를 전송해 줄 Center 클래스
        Sam sam = new Sam(center);      // 예비군 Sam 클래스 객체 생성과 동시에 옵저버 등록
         
        center.changeInformation("서울", "010-2222-3333");
        center.changeInformation("경기", "010-1111-7777");
        center.changeInformation("대구", "010-9898-2929");


//출처: http://ssamhouse.tistory.com/entry/JAVA-옵저버패턴-Observer-Pattern [SSAM's House]
		
	}
}
