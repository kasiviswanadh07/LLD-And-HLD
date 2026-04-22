package com.viswa.patterns.behavioralpatterns.state.TrafficSignals;

public class Demo {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight();

        trafficLight.changeState();
        trafficLight.changeState();
        trafficLight.changeState();

    }
}
