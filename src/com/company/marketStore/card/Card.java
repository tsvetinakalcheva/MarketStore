package com.company.marketStore.card;

public abstract class Card {
    private String owner;
    private double discountRate;
    private double purchase;


    protected String getOwner() {
        return owner;
    }

    protected void setOwner(String owner) {
        this.owner = owner;
    }

    protected double getDiscountRate() {
        return discountRate;
    }

    protected void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
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

    @Override
    public String toString() {
        return String.format("Purchase value: $%.2f%nDiscount rate: %.1f%%%nDiscount: $%.2f%nTotal: $%.2f%n",
                this.getPurchase(),
                this.getDiscountRate() * 100,
                discountCurrentPurchase(),
                this.purchase - discountCurrentPurchase());
    }
}
