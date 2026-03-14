package com.viswa.patterns.behavioralpatterns.observerpattern.observable;

import com.viswa.patterns.behavioralpatterns.observerpattern.observer.WeatherObserver;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReadings(float temperature, float humadity, float pressure);
}
