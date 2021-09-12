package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 10;
      /*  int b = 0;
        String S = "";
        b = a;
        if (a == 0) {
            S = "0";
        } else {
            while (a > 0) {
                S = Integer.toString(a % 2) + S;
                a = a / 2;
            }
        }*/
        System.out.print("given ");
        System.out.println(a);
        System.out.print("find ");
        System.out.println(ConvertToBinary.toBinary(a));
        System.out.print("examination ");
        System.out.println(Integer.toBinaryString(a));


    }
}
