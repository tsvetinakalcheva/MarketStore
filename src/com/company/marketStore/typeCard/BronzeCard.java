package com.company.marketStore.typeCard;

import com.company.marketStore.card.Card;

public class BronzeCard extends Card {
    private double turnoverPreviousMonth;
    public BronzeCard(double turnoverPreviousMonth, double purchase) {
        this.turnoverPreviousMonth = turnoverPreviousMonth;
        setDiscountRate(getDiscountRate());
        setPurchase(purchase);

    }


    public double getTurnoverPreviousMonth() {
        return turnoverPreviousMonth;
    }

    public void setTurnoverPreviousMonth(double turnoverPreviousMonth) {
        this.turnoverPreviousMonth = turnoverPreviousMonth;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        if (getTurnoverPreviousMonth()> 0 && getTurnoverPreviousMonth()< 100) {
            this.setDiscountRate(0.0);
        } else if (getTurnoverPreviousMonth() >= 100 && getTurnoverPreviousMonth() < 300) {
            setDiscountRate(0.01);
        } else if(getTurnoverPreviousMonth() >= 300){
            setDiscountRate(0.025);
        }
    }

}
