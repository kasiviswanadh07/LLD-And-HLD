package com.viswa.interviewQuestions.parking_Lot.Pricing;

import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;

public class CostComputation {
    private final PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket) {;

        return pricingStrategy.calculate(ticket);
    }

}
