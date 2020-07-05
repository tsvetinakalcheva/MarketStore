package com.company.typeCard;

import com.company.card.Card;

public class BronzeCard extends Card {
    private double turnoverPreviousMonth;
    private double discountRate;

    public BronzeCard(double turnoverPreviousMonth, double purchase) {
        this.turnoverPreviousMonth = turnoverPreviousMonth;
        calculateDiscountRate();
        setPurchase(purchase);
    }

    @Override
    public void calculateDiscountRate() {
        if (getTurnoverPreviousMonth()> 0 && getTurnoverPreviousMonth()< 100) {
            setDiscountRate(0.0);
        } else if (getTurnoverPreviousMonth() >= 100 && getTurnoverPreviousMonth() < 300) {
            setDiscountRate(0.01);
        } else if(getTurnoverPreviousMonth() >= 300){
            setDiscountRate(0.025);
        }
    }

}
