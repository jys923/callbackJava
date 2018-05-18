package Observer1;

public class Sam implements Observer , DisplayElement{
    
    private Center center;
    private String location;
    private String phoneNum;
     
    public Sam(Center center) {
        // ��ü�� �����Ǹ� ���� ������ ���� ��ü�� �����ϰ�, ���� �ش� ��ü�� �������� ����Ѵ�.
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
        // ���� �������� ��ϵǾ� �ִ� ��ü�� ���ؼ� ȣ��Ǵ� �޼ҵ�
        this.location = location;
        this.phoneNum = phoneNum;
        display();
    }
 
}


//��ó: http://ssamhouse.tistory.com/entry/JAVA-����������-Observer-Pattern [SSAM's House]