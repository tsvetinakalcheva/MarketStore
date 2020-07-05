package com.company.card;

public abstract class Card {
    private String owner;
    private double purchase;
    private double turnoverPreviousMonth;
    private double discountRate;

    public abstract void calculateDiscountRate();

    protected String getOwner() {
        return owner;
    }

    protected void setOwner(String owner) {
        this.owner = owner;
    }

    public double getTurnoverPreviousMonth() {
        return turnoverPreviousMonth;
    }

    public void setTurnoverPreviousMonth(double turnoverPreviousMonth) {
        this.turnoverPreviousMonth = turnoverPreviousMonth;
    }
    protected double getPurchase() {
        return purchase;
    }

    protected void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    protected double discountCurrentPurchase() {
        return  getPurchase() * getDiscountRate();
    }

    protected double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return String.format("Purchase value: $%.2f%nDiscount rate: %.1f%%%nDiscount: $%.2f%nTotal: $%.2f%n",
                this.getPurchase(),
                this.getDiscountRate() * 100,
                discountCurrentPurchase(),
                this.purchase - discountCurrentPurchase());
    }
}
