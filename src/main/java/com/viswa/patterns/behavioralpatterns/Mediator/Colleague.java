package com.viswa.patterns.behavioralpatterns.Mediator;

public interface Colleague {

    void placeBid(int bidAmount);

    void receiveBidNotification(int bidAmount);

    String getName();
}
