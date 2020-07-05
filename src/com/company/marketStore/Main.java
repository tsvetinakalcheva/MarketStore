package com.company.marketStore;

import com.company.marketStore.typeCard.BronzeCard;
import com.company.marketStore.typeCard.GoldCard;
import com.company.marketStore.typeCard.SilverCard;

public class Main {
    public static void main(String[] args) {

        BronzeCard bronzeCard = new BronzeCard(0, 150);
        System.out.println(bronzeCard.toString());

        SilverCard silverCard = new SilverCard(600, 850);
        System.out.println(silverCard.toString());

        GoldCard goldCard = new GoldCard(1500, 1300);
        System.out.println(goldCard.toString());
    }
}
