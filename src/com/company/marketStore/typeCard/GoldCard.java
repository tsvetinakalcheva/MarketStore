package com.company.marketStore.typeCard;

import com.company.marketStore.card.Card;

public class GoldCard extends Card {
    private double turnoverPreviousMonth;

    public GoldCard(double turnoverPreviousMonth, double purchase) {

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
        if (getTurnoverPreviousMonth() < 100) {
            setDiscountRate(0.02);
        } else if (getTurnoverPreviousMonth() >= 100 && getTurnoverPreviousMonth() < 200) {
            setDiscountRate(0.03);
        } else if (getTurnoverPreviousMonth() >= 200 && getTurnoverPreviousMonth() < 300) {
            setDiscountRate(0.04);
        } else if (getTurnoverPreviousMonth() >= 300 && getTurnoverPreviousMonth() < 400) {
            setDiscountRate(0.05);
        } else if (getTurnoverPreviousMonth() >= 400 && getTurnoverPreviousMonth() < 500) {
            setDiscountRate(0.06);
        } else if (getTurnoverPreviousMonth() >= 500 && getTurnoverPreviousMonth() < 600) {
            setDiscountRate(0.07);
        } else if (getTurnoverPreviousMonth() >= 600 && getTurnoverPreviousMonth() < 700) {
            setDiscountRate(0.08);
        } else if (getTurnoverPreviousMonth() >= 700 && getTurnoverPreviousMonth() < 800) {
            setDiscountRate(0.09);
        } else if (getTurnoverPreviousMonth() >= 800) {
            setDiscountRate(0.10);
        }
    }

}
