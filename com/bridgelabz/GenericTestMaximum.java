package com.bridgelabz;

public class GenericTestMaximum {
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
        String maxString=compareTo("Apple","Peach","Banana");
        System.out.println("Maximum from 3 String : "+maxString);

    }
}
