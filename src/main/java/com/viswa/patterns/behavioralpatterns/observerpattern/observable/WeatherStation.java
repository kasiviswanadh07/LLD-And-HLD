package com.viswa.patterns.behavioralpatterns.observerpattern.observable;

import com.viswa.patterns.behavioralpatterns.observerpattern.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    private final List<WeatherObserver> observersList;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherStation() {
        observersList = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observersList.add(observer);
        System.out.println("[+] Observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observersList.remove(observer);
        System.out.println("[-] Observer Remove: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observersList) {
            observer.update();
        }

    }

    @Override
    public void setWeatherReadings(float temperature, float humadity, float pressure) {
        this.temperature = temperature;
        this.humidity = humadity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "observersList=" + observersList +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressue=" + pressure +
                '}';
    }

    public List<WeatherObserver> getObserversList() {
        return observersList;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressue() {
        return pressure;
    }

    public void setPressue(float pressue) {
        this.pressure = pressue;
    }
}
