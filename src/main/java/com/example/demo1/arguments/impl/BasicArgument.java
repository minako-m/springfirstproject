package com.example.demo1.arguments.impl;

import com.example.demo1.arguments.Argument;

public class BasicArgument implements Argument {
    private final String value;

    public BasicArgument(String value) {
        this.value = value;
    }

    @Override
    public String getAsString() {
        return value;
    }
}
