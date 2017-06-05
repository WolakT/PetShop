package com.company;

import java.util.Currency;

/**
 * Created by RENT on 2017-06-02.
 */
public class Lizard implements Comparable<Lizard> {
    private double price;

    public double getPrice() {
        return price;
    }

    public Lizard(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Lizard o) {
        if(this.getPrice()>o.getPrice()) return 1;
        else if(this.getPrice()<o.getPrice()) return -1;
        else return 0;
    }
}
