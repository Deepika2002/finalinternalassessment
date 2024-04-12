package com.example;

public class OEP {
    public String play(int number) {
        if (isPrime(number)) {
            return "PRIME";
        }
        return number % 2 == 0 ? "EVEN" : "ODD";
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
