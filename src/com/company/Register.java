package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class Register {
    private ArrayList<Cat> cats = new ArrayList<>();
    private ArrayList<Lizard> lizards = new ArrayList<>();

    public Register(ArrayList<Cat> cats, ArrayList<Lizard> lizards){
        this.cats = cats;
        this.lizards = lizards;
    }
    public void registerSale(Employee employee, int amount, String animal){
        employee.setAmountSold(employee.getAmountSold()+amount);
        if(animal.equals("cat")){
            cats.remove(cats.size()-1);
        } else lizards.remove(lizards.size()-1);
    }
}
