package com.viswa.patterns.behavioralpatterns.Mediator;

public class Bidder implements Colleague {

    AuctionMediator auctionMediator;
    String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder " + name + " got the notification some has put bid of: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
