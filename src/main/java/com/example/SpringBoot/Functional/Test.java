package com.example.SpringBoot.Functional;

import java.util.function.Function;

// Defining a class named Test which implements the Function interface
// This class represents a functional component that takes a String input and returns a String output
public class Test implements Function<String, String> {

    // Overriding the apply method of the Function interface
    // This method defines the functionality of the functional component
    @Override
    public String apply(String t) {
        // Concatenating a custom message with the input String and returning it
        return "Serverless functional programming : example by " + t;
    }

}
