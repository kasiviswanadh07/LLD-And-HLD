package com.viswa.patterns.behavioralpatterns.state.TrafficSignals;

public class RedState implements TrafficLightState {
    @Override
    public void action(TrafficLight signal) {
        System.out.println("Change the state from red to green state");
        signal.setState(new GreenState());
    }
}
