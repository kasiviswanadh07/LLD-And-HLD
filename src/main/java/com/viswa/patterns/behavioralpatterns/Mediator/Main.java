package com.viswa.patterns.behavioralpatterns.Mediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator=new Auction();
        Colleague bidder=new Bidder(auctionMediator,"kasi" );
        Colleague bidder2=new Bidder(auctionMediator,"viswa" );

        bidder.placeBid(2003);
        bidder2.placeBid(2005);
        bidder.placeBid(20500);
    }
}
