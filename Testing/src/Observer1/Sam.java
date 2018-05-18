package Observer1;

public class Sam implements Observer , DisplayElement{
    
    private Center center;
    private String location;
    private String phoneNum;
     
    public Sam(Center center) {
        // 객체가 생성되면 내가 정보를 받을 주체를 설정하고, 나를 해당 주체에 옵저버로 등록한다.
        this.center = center;
        this.center.registerObserver(this);
    }
     
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Location : " + location + " , phoneNum : " + phoneNum);
    }
 
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Sam";
    }
     
    @Override
    public void update(String location, String phoneNum) {
        // 내가 옵저버로 등록되어 있는 주체에 의해서 호출되는 메소드
        this.location = location;
        this.phoneNum = phoneNum;
        display();
    }
 
}


//출처: http://ssamhouse.tistory.com/entry/JAVA-옵저버패턴-Observer-Pattern [SSAM's House]