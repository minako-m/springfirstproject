package com.example.demo1.arguments;

import com.example.demo1.arguments.exception.ValueNotFoundException;

public interface Argument {
    String getAsString() throws ValueNotFoundException;
}
