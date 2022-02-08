package com.company;


public class Main {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[] {2, 7, 11, 15};
        int target = 9;

        Addition addition = new Addition();

        //Should output [2,7]
        System.out.println(addition.twoSum(arrayOfInts, target));


        }
}
