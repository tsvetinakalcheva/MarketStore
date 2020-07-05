package com.company.typeCard;

import com.company.card.Card;

public class SilverCard extends Card {
    private double turnoverPreviousMonth;
    public SilverCard(double turnoverPreviousMonth, double purchase) {

    this.turnoverPreviousMonth = turnoverPreviousMonth;
        calculateDiscountRate();
        setPurchase(purchase);
    }

    public double getTurnoverPreviousMonth() {
        return turnoverPreviousMonth;
    }

    public void setTurnoverPreviousMonth(double turnoverPreviousMonth) {
        this.turnoverPreviousMonth = turnoverPreviousMonth;
    }

    @Override
    public void calculateDiscountRate() {
        if (getTurnoverPreviousMonth() > 0 && getTurnoverPreviousMonth() < 300) {
            setDiscountRate(0.02);
        } else  {
            setDiscountRate(0.035);
        }
    }
}
