package com.kodilla.exception.test;

public class HandlerChecker {
    public String handlerChecking() {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        String result = exceptionHandling.exceptionHandle(0, 1);
        return result;
    }
}
