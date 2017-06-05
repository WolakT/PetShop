package com.company;

import java.util.Currency;

/**
 * Created by RENT on 2017-06-02.
 */
public class Cat implements Comparable<Cat> {
    private double price;
    private int age;

    public double getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    public Cat(double price, int age) {
        this.price = price;
        this.age = age;
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.getAge()>cat.getAge())
        return -1;
        else if(this.getAge()<cat.getAge())
            return 1;
        else return 0;
    }
}
