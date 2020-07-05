package com.company;

import com.company.typeCard.BronzeCard;
import com.company.typeCard.GoldCard;
import com.company.typeCard.SilverCard;

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
