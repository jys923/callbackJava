package Observer1;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}


//��ó: http://ssamhouse.tistory.com/entry/JAVA-����������-Observer-Pattern [SSAM's House]