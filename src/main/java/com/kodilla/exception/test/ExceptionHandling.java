package com.kodilla.exception.test;

public class ExceptionHandling {
    public String exceptionHandle(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            return secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("There is a problem: " + e + "\nProblem with numbers - check if x is not >= 2 or x <1 or y isn't equals 1.5");
        } finally {
            System.out.println("End of program");
        }
        return null;
    }
}
