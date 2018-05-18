package Observer1;

import java.util.ArrayList;

public class Center implements Subject{
     
    private ArrayList<Observer> observers;  // ������ ��ü���� ������ ArrayList
    private String location;                // ������ ��ü�鿡�� ������ ��� ����
    private String phoneNum;                // ������ ��ü�鿡�� ������ ��ȭ��ȣ ����
     
    public Center() {
        // Center ��ü�� �����Ǹ� ArrayList ��ü�� �ʱ�ȭ �Ѵ�.
        observers = new ArrayList<Observer>();
    }
     
    // ������ ����Ǿ��� ��, �ܺη� ���� ȣ��Ǵ� �޼ҵ�
    public void changeInformation(String location, String phoneNum){
        this.location = location;
        this.phoneNum = phoneNum;
        notifyObservers();  // ������ ��ü�鿡�� ���� ������ �˸���.
    }
     
    @Override
    public void registerObserver(Observer o) {
        // ������ ��ü�� ����Ѵ�.
        System.out.println(o.getName() + " ������ ��ü ��� �ϰڽ��ϴ�.");
        observers.add(o);
    }
 
    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        if(observers.contains(o)){
            System.out.println("������ ��ü ����.. �����ϰڽ��ϴ�.");
            observers.remove(o);
        } else {
            System.out.println("������ ��ü�� ���׿�...");
        }
    }
 
    @Override
    public void notifyObservers() {
        // ������ ��ü�鿡�� ���������� ������Ʈ �Ѵ�.
        for (Observer observer : observers) {
            observer.update(location, phoneNum);
        }
    }
 
}


//��ó: http://ssamhouse.tistory.com/entry/JAVA-����������-Observer-Pattern [SSAM's House]