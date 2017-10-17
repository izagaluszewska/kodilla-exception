package com.kodilla.exception.challenge;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FirstChallengeTestSuite {
    @Test
    public void testDivideThroughFraction() {
        //Given
        FirstChallenge firstChallenge = new FirstChallenge();
        //When
        double result = firstChallenge.divide(3, 0.2);
        //Then
        Assert.assertEquals(15, result, 0.001);
    }

    @Test
    public void testDivideThroughMinusFraction() {
        //Given
        FirstChallenge firstChallenge = new FirstChallenge();
        //When
        double result = firstChallenge.divide(3, -0.2);
        //Then
        Assert.assertEquals(-15, result, 0.001);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIsExceptionThrown() throws Exception {
        //Given
        thrown.expect(ArithmeticException.class);
        final FirstChallenge firstChallenge = new FirstChallenge();
        //When
        firstChallenge.divide(3, 0);
        //Then
        Assert.fail();
    }
}
