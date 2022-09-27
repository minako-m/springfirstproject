package com.example.demo1.operations;

import com.example.demo1.commands.Command;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public abstract class AbstractOperation implements Operation {
    private final String name;

    public boolean canDo(Command c) {
        return (Objects.equals(c.getName(), name));
    }
}
