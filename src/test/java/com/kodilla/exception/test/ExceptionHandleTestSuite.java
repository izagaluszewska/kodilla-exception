package com.kodilla.exception.test;

import org.junit.*;

public class ExceptionHandleTestSuite {
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

    @Test
    public void testExceptionHandleWithoutException() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When
        String result = exceptionHandling.exceptionHandle(1.0, 1.0);
        //Then
        Assert.assertEquals("Done!", result);
    }

    @Test
    public void testExceptionHandleYCauseException() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When
        String result = exceptionHandling.exceptionHandle(1.0, 1.5);
        //Then
        Assert.assertEquals(null, result);
    }

    @Test
    public void testExceptionHandleXCauseException() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When
        String resultX2 = exceptionHandling.exceptionHandle(2.0, 1.0);
        String resultX0 = exceptionHandling.exceptionHandle(0.0, 1.0);
        //Then
        Assert.assertEquals(null, resultX2);
        Assert.assertEquals(null, resultX0);
    }
}
