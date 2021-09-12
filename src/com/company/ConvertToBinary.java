package com.company;

public class ConvertToBinary {
    public static void main(String[] args) {

        //test numbers
        int[] testNumbers = new int[]{0, 10, 1, 8, 65, 255};
        //go through the test numbers array
        for (int i = 0; i < testNumbers.length; i++) {
            //each number convert to binary
            String binaryString = toBinary(testNumbers[i]);
            //compare converter results with correct result
            if (!Integer.toBinaryString(testNumbers[i]).equals(binaryString)) {
                //incorrect result is printed and program stops
                System.out.println("Incorrect converting of " + testNumbers[i]);
                System.out.println("Expected: " + Integer.toBinaryString(testNumbers[i]));
                System.out.println("Actual: " + binaryString);
                break;
            }
            else {
                System.out.print("In decimal notation " + testNumbers[i]);
                System.out.println("  in binary notation  " + binaryString);
            }
        }
        System.out.println("Successfully executed");
    }

    public static String toBinary(int n) {
        String S = "";
        if (n==0) { return  "0";}
        while (n > 0) {
            S = Integer.toString(n % 2) + S;
            n = n / 2;
        }
        return S;
    }
}
