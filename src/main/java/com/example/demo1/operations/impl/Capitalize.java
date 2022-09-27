package com.example.demo1.operations.impl;

import com.example.demo1.arguments.exception.ValueNotFoundException;
import com.example.demo1.commands.Command;
import com.example.demo1.operations.AbstractOperation;
import com.example.demo1.operations.Result;
import org.springframework.stereotype.Component;

@Component
public class Capitalize extends AbstractOperation {
    public Capitalize() {
        super("cap");
    }

    @Override
    public boolean validate(Command c) {
        return c.numberOfAttributes() == 1;
    }

    @Override
    public Result process(Command c) throws ValueNotFoundException {
        return new Result(c.getAttributeAsString("text").toUpperCase());
    }
}
