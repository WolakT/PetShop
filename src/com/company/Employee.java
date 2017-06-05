package com.company;

/**
 * Created by RENT on 2017-06-05.
 */
public class Employee {
    private int amountSold;
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
