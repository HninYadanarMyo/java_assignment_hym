package com.talent.batch11.day3.homework;

public class Homework6 {

        public static void main(String[] args) {
            int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            int primeCount = 0;
            for (int num : numbers) {
                if (Homework5.isPrime(num)) {
                    primeCount++;
                }
            }
            System.out.println("Number of prime numbers in the array: " + primeCount);
        }

}
