package com.viswa.patterns.behavioralpatterns.observerpattern;

import com.viswa.patterns.behavioralpatterns.observerpattern.observable.WeatherObservable;
import com.viswa.patterns.behavioralpatterns.observerpattern.observable.WeatherStation;
import com.viswa.patterns.behavioralpatterns.observerpattern.observer.CurrentConditionsDisplay;
import com.viswa.patterns.behavioralpatterns.observerpattern.observer.ForecastDisplay;

public class weatherStationApp {
    public static void main(String[] args) {
        System.out.println("###### State Design Pattern ######");
        // Create the weather station (observable/subject)
        WeatherObservable weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        System.out.println("===>>> Initial Weather Update");
        weatherStation.setWeatherReadings(80, 65, 30.5f);

        System.out.println("===>>> Second Weather Update");
        weatherStation.setWeatherReadings(82, 70, 29.2f);
        weatherStation.removeObserver(forecastDisplay);

        System.out.println("===>>> Third Weather Update");
        weatherStation.setWeatherReadings(70, 21, 29.2f);
        // Forecast display will not be notified


    }
}
