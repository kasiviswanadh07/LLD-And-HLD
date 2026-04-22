package com.viswa.patterns.behavioralpatterns.state.TrafficSignals;

public class GreenState implements TrafficLightState {
    @Override
    public void action(TrafficLight signal) {
        System.out.println("Change the state from GreenState to red state");
        signal.setState(new YellowState());
    }
}
