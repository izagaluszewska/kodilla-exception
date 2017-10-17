package com.kodilla.exception.flight;

public class RouteNotFoundException extends Exception {
    public String exceptionInfo() {
        return "This route doesn't exist. Try another route";
    }
}
