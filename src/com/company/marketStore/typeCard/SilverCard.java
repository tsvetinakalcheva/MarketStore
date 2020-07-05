package com.company.marketStore.typeCard;

import com.company.marketStore.card.Card;

public class SilverCard extends Card {
    private double turnoverPreviousMonth;
    public SilverCard(double turnoverPreviousMonth, double purchase) {
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
        if (getTurnoverPreviousMonth() > 0 && getTurnoverPreviousMonth() < 300) {
            setDiscountRate(0.02);
        } else  {
            setDiscountRate(0.035);
        }
    }
}
