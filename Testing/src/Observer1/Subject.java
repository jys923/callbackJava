package Observer1;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}


//출처: http://ssamhouse.tistory.com/entry/JAVA-옵저버패턴-Observer-Pattern [SSAM's House]