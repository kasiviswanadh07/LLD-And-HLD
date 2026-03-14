package com.viswa.patterns.behavioralpatterns.observerpattern.observer;

import com.viswa.patterns.behavioralpatterns.observerpattern.observable.WeatherObservable;

public class ForecastDisplay implements WeatherObserver {
    WeatherObservable weatherStation;

    public ForecastDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Saving weather data... ");
        display();
    }
    public void display() {
        System.out.println("Current Weather Conditions: " + weatherStation.toString());
    }
}
