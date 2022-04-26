package com.engeto.ukol_03_fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int result3 = i % 3;
            int result5 = i % 5;
            if (result3 == 0 && result5 == 0) {
                System.out.println("FizzBuzz");
            } else if (result3 == 0) {
                System.out.println("Fizz");
            } else if (result5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
