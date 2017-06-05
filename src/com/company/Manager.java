package com.company;

/**
 * Created by RENT on 2017-06-05.
 */
public class Manager extends Employee {
   // private String name;
    private static int managersCount= 0;

    public Manager(String name){
        super(name);
        managersCount++;

    }
    public int getManagersCount() {return managersCount;}
}
