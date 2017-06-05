package com.company;

import javafx.collections.transformation.SortedList;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> arraylistOfCats = new ArrayList<>();
       ArrayList<Lizard> arraListOfLizards = new ArrayList<>();



        Scanner scanner = new Scanner(System.in );

        System.out.println("Please privide the amount of cats");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Price of " + (i+1) + " cat");
            double price = Double.parseDouble(scanner.next());
            System.out.println("Age of " + (i+1) + " cat");
            int age = scanner.nextInt();
            arraylistOfCats.add(new Cat(price, age));



            }

        Collections.sort(arraylistOfCats);
        for (Cat sortedCat : arraylistOfCats) {

            System.out.println(sortedCat.getAge());
        }

        System.out.println("Please privide the amount of lizards");
        count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Price of " + (i+1) + " lizard");
            double price = Double.parseDouble(scanner.next());
            arraListOfLizards.add(new Lizard (price));
        }

        Collections.sort(arraListOfLizards);
        for (Lizard liz: arraListOfLizards ) {
            System.out.println(liz.getPrice());

        }
        Register register = new Register(arraylistOfCats, arraListOfLizards);
        System.out.println("Please provide Manager name");
        HashMap<String,Employee> emp = new HashMap<>();
        String empName = scanner.next();
        emp.put(empName, new Employee(empName));
        System.out.println("Please provide the employee name");
        empName = scanner.next();
        emp.put(empName, new Employee(empName));
        System.out.println("register sale");
        while (scanner.hasNext()){
            register.registerSale(emp.get(scanner.next()), scanner.nextInt(), scanner.next());
            System.out.println(emp.get("Wiesiu").getAmountSold());;
        }


    }
}
