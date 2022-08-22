package com.bridgelabz;

public class GenericTestMaximum {
    public static Float compareTo(Float a, Float b, Float c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("----!Welcome to Generic Test Maximum!-----");
        float maxFloat = compareTo(30.10F, 50.12F, 90.52F);
        System.out.println("Maximum from 3 Float : " + maxFloat);

    }
}