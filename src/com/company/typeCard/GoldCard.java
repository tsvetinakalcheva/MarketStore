package com.company.typeCard;

import com.company.card.Card;

public class GoldCard extends Card {
    private static final int MAX_RATE = 10;
    private double turnoverPreviousMonth;

    public GoldCard(double turnoverPreviousMonth, double purchase) {
        setTurnoverPreviousMonth(turnoverPreviousMonth);
        setDiscountRate(0.02);
        calculateDiscountRate();
        setPurchase(purchase);
    }

    @Override
    public void calculateDiscountRate() {
        double rate = 0.02d;
        int maxCounterRate = 2;
        int turnover = 100;
        while(maxCounterRate < MAX_RATE){
            if(getTurnoverPreviousMonth() > turnover){
                rate = Double.sum(rate,0.01d);
                turnover += 100;
            }
            maxCounterRate++;
        }
        setDiscountRate(rate);
    }

}
