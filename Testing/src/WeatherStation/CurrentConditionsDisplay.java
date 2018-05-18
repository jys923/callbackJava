package WeatherStation;

public class CurrentConditionsDisplay implements Observer/*날씨 데이터 갱신 체크*/ ,DisplayElement/*콜백아님,반드시 있어야하는거*/{
	private Subject mweatherData;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		mweatherData = weatherData;
		mweatherData.registerObserver(this);	//옵저버 등록
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
