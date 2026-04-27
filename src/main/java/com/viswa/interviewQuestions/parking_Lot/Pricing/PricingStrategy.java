package com.viswa.interviewQuestions.parking_Lot.Pricing;

import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
