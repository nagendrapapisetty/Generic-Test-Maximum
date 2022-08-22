package com.bridgelabz;

import java.util.ArrayList;
import  java.util.Collections;

public class GenericTestMaximum <T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<T>();

    GenericTestMaximum(T... inputs) {

        for (T value : inputs) {
            this.list.add(value);
        }
    }

    public T testMaximum() {
        return GenericTestMaximum.testMaximum(list);
    }

    public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {
        Collections.sort(list);
        T maxValue = list.get(list.size() - 1);
        showMaxValue(list, maxValue);
        return maxValue;
    }
    public static <T> void showMaxValue(ArrayList<T> list, T maxValue) {
        System.out.println("\nInput values : ");
        for (T value : list) {
            System.out.print(value + " , ");
        }
        System.out.println("\nMaximum : " + maxValue);
    }

    public static void main(String[] args) {
        System.out.println("----!Welcome to Generic Test Maximum!-----");
        Integer intValue1 = 30, intValue2 = 50, intValue3 = 90;
        Float floatValue1 = 3.3f, floatValue2 = 3.5f, floatValue3 = 8.7f;
        String stringValue1 = "Apple", stringValue2 = "Peach", stringValue3 = "Banana";

        new GenericTestMaximum(intValue1, intValue2, intValue3).testMaximum();
        System.out.println("---------------------------------------------------");
        new GenericTestMaximum(floatValue1, floatValue2, floatValue3).testMaximum();
        System.out.println("----------------------------------------------------");
        new GenericTestMaximum(stringValue1, stringValue2, stringValue3).testMaximum();

    }
}