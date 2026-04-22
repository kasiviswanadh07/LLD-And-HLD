package com.viswa.patterns.behavioralpatterns.state.TrafficSignals;

public class TrafficLight {
    TrafficLightState state;

    public TrafficLight() {
        state = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.action(this);
    }
}
