package com.company;

/**
 * Created by RENT on 2017-06-05.
 */
    public class SelectionSort<DataType extends Comparable> implements Sorter<DataType> {

    public DataType[] sort(DataType[] animals) {
        for (int i = 0; i < animals.length; i++) {
            for (int j = i; j < animals.length - 1; j++) {
                if (animals[i].compareTo(animals[j + 1]) > 0) {
                    swap(animals, i, j + 1);
                }
            }
        }

        return animals;
    }

    //checks alphabetical order of two Strings and returns true if first is higher
    public static boolean isHigherInAlphabet(String first, String second) {
        if (first.compareTo(second) < 0) {
            return true;
        } else return false;

    }

    public DataType[] swap(DataType[] animals, int p, int r) {
        DataType temp = animals[p];
        animals[p] = animals[r];
        animals[r] = temp;

        return animals;
    }
}