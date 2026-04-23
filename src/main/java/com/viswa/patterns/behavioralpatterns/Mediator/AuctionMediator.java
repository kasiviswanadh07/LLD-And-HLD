package com.viswa.patterns.behavioralpatterns.Mediator;

public interface AuctionMediator {
    void placeBid(Colleague bidder, int bidAmount);

    void addBidder(Colleague bidder);
}
