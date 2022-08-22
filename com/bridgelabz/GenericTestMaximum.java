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
    public static Float compareTo(Float a,Float b,Float c) {
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
    public static String compareTo(String str1,String str2,String str3) {
        if(str1.compareTo(str2) > 0 ) {
            if(str1.compareTo(str3) > 0) {
                return str1;
            } else {
                return str3;
            }
        } else {
            if(str2.compareTo(str3) > 0) {
                return str2;
            } else {
                return str3;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("----!Welcome to Generic Test Maximum!-----");
        int maxInt=compareTo(50,100,90);
        System.out.println("Maximum from 3 Integer : "+maxInt);
        float maxFloat=compareTo(50.12F,20.23F,90.52F);
        System.out.println("Maximum from 3 Float : "+maxFloat);

        String maxString=compareTo("Apple","Peach","Banana");
        System.out.println("Maximum from 3 String : "+maxString);

    }
}