package WeatherStation;

import java.util.ArrayList;

public class WeatherData  implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}

	public void measurementsChanged(){ notifyObservers(); }
	
	public void setMeasurementsChanged(float t, float h, float p){	//값이 세팅된다고 가정.
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementsChanged();
	}
	
	@Override
	public void notifyObservers() {
		for (int i=0;i<observers.size();i++) {
			Observer observer= (Observer) observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observers.contains(observer)) observers.remove(observer);
	}
}
