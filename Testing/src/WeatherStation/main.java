package WeatherStation;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay= new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurementsChanged(80,63,30.4f);
		
	}

}
