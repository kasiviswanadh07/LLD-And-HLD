package com.viswa.patterns.behavioralpatterns.Mediator;

import java.util.ArrayList;

public class Auction implements AuctionMediator {
    ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague colleague : colleagues) {
            if (!colleague.getName().equalsIgnoreCase(bidder.getName())) {
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }
}
