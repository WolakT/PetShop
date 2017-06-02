package com.company;

import java.util.Currency;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Cat[] arrayOfCats;
        Stack<Cat> stackOfCats = new Stack<>();
        Lizard[] arrayOfLizards;
        Scanner scanner = new Scanner(System.in );

        System.out.println("Please privide the amount of cats");
        int count = scanner.nextInt();
        arrayOfCats = new Cat[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Price of " + (i+1) + " cat");
            double price = Double.parseDouble(scanner.next());
            System.out.println("Age of " + (i+1) + " cat");
            int age = scanner.nextInt();
            Cat cat = new Cat(price ,age);
            arrayOfCats[i] = cat;
        }

        System.out.println("Please privide the amount of lizards");
        count = scanner.nextInt();
        arrayOfLizards = new Lizard[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Price of " + (i+1) + " lizard");
            double price = Double.parseDouble(scanner.next());
            Lizard lizard = new Lizard(price);
            arrayOfLizards[i] = lizard;
        }

    }
}
