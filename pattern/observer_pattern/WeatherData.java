package observer_pattern;
import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override                     
    public void registerObserver(Observer o) {                
        observers.add(o);         
    }    

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for( Observer observer:observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
