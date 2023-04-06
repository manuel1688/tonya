package observer_pattern;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentconditionsDisplay currentdisplay = new CurrentconditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
    
}
