package com.example.demo1.commands;

import com.example.demo1.arguments.Argument;
import com.example.demo1.arguments.exception.ValueNotFoundException;

public interface Command {
    String getName();
    String getAttributeAsString(String name) throws ValueNotFoundException;
    boolean containsAttribute(String name);
    int numberOfAttributes();
    void addArgument(String name, Argument arg);
}
