package com.statefarm;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int sumValue = 0;
        if (args.length < 1) {
            System.out.println(0);
        } else if (args.length > 0){
            for (var i = 0; i < args.length; i++) {
                int value = Integer.parseInt(args[i]);
                if (value >= 0) {
                    sumValue = value + sumValue;
                }
        }
            System.out.println("The sum is: " + sumValue);
    }
    }
}
