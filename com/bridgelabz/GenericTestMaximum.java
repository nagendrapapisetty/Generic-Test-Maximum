package com.bridgelabz;

public class GenericTestMaximum {
        public static Integer compareTo(Integer a,Integer b,Integer c) {
            if(a > b){
                if(a > c) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if(b > c) {
                    return b;
                } else {
                    return c;
                }
            }
        }

        public static void main(String[] args) {
            System.out.println("----!Welcome to Generic Test Maximum!-----");
            int max=compareTo(100,50,90);
            System.out.println("Maximum from 3 Integer : "+max);
        }
    }
