// Design Principle
//__ Strive for loosely coupled designs between objetcs that interract.
//__ Loosely coupled designs allow us to build fexible OO systems that can handle change because they minize the interdependency between objects.

//__ The Observer Pattern: defines a one-to-many dependency between objects so that when one object changes state, all of its dependents
//are notified and updated automatically.

package observer_pattern;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentconditionsDisplay currentdisplay = new CurrentconditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
    
}
