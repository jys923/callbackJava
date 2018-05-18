package Observer1;

import java.util.ArrayList;

public class Center implements Subject{
     
    private ArrayList<Observer> observers;  // 옵저버 객체들을 보관할 ArrayList
    private String location;                // 옵저버 객체들에게 전달한 장소 정보
    private String phoneNum;                // 업저버 객체들에게 전달할 전화번호 정보
     
    public Center() {
        // Center 객체가 생성되면 ArrayList 객체를 초기화 한다.
        observers = new ArrayList<Observer>();
    }
     
    // 정보가 변경되었을 때, 외부로 부터 호출되는 메소드
    public void changeInformation(String location, String phoneNum){
        this.location = location;
        this.phoneNum = phoneNum;
        notifyObservers();  // 옵저버 객체들에게 변경 정보를 알린다.
    }
     
    @Override
    public void registerObserver(Observer o) {
        // 옵저버 객체를 등록한다.
        System.out.println(o.getName() + " 옵저버 객체 등록 하겠습니다.");
        observers.add(o);
    }
 
    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        if(observers.contains(o)){
            System.out.println("옵저버 객체 존재.. 삭제하겠습니다.");
            observers.remove(o);
        } else {
            System.out.println("옵저버 객체가 없네요...");
        }
    }
 
    @Override
    public void notifyObservers() {
        // 옵저버 객체들에게 변경정보를 업데이트 한다.
        for (Observer observer : observers) {
            observer.update(location, phoneNum);
        }
    }
 
}


//출처: http://ssamhouse.tistory.com/entry/JAVA-옵저버패턴-Observer-Pattern [SSAM's House]