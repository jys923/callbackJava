package WeatherStation;

public class CurrentConditionsDisplay implements Observer/*���� ������ ���� üũ*/ ,DisplayElement/*�ݹ�ƴ�,�ݵ�� �־���ϴ°�*/{
	private Subject mweatherData;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		mweatherData = weatherData;
		mweatherData.registerObserver(this);	//������ ���
	}

	@Override
	public void display() {
		System.out.println("Current conditions : "+temperature+" , "+humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}
}
