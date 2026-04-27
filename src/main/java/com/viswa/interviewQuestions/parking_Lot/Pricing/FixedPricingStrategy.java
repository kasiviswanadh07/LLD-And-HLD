package com.viswa.interviewQuestions.parking_Lot.Pricing;

import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;

public class FixedPricingStrategy implements PricingStrategy {
    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}
