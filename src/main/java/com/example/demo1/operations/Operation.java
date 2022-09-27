package com.example.demo1.operations;

import com.example.demo1.arguments.exception.ValueNotFoundException;
import com.example.demo1.commands.Command;

public interface Operation {
    boolean canDo(Command c);
    boolean validate(Command c);
    Result process(Command c) throws ValueNotFoundException;
}
