package com.company;

public class Addition {

    public Addition() {
    }

    //This method takes in an array and an int called target and returns the indexes whose values equal the value of
    // the target variable
    public String twoSum(int[] nums, int target) {

        int variableOne = 0;
        int variableTwo = 0;
        int targetSum = 0;
        int i = 0;


        String output = null;
        while (i < nums.length - 1) {
            variableOne = nums[i];
            variableTwo = nums[i + 1];
            targetSum = variableOne + variableTwo;

            if (targetSum == target) {
                output = "[" + variableOne + "," + variableTwo + "]";

            }
            i++;
        }

        return output;
    }
}
