package com.kodilla.exception.test;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class SecondChallengeTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test # " + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("End of test\n");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIsExceptionThrown() throws Exception {
        //Given
        thrown.expect(Exception.class);
        final SecondChallenge secondChallenge = new SecondChallenge();
        //When
        secondChallenge.probablyIWillThrowException(2, 1.5);
        //Then
        Assert.fail();
    }
}
