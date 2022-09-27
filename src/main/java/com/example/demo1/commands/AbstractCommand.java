package com.example.demo1.commands;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public abstract class AbstractCommand {
    @EqualsAndHashCode.Include
    private final String name;
}
