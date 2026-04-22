package com.viswa.patterns.behavioralpatterns.state.TrafficSignals;

public class YellowState implements TrafficLightState {
    @Override
    public void action(TrafficLight signal) {
        System.out.println("Change the state from yellow to red state");
        signal.setState(new RedState());
    }
}
