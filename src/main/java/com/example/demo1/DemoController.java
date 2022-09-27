package com.example.demo1;

import com.example.demo1.arguments.exception.ValueNotFoundException;
import com.example.demo1.arguments.impl.FileArgument;
import com.example.demo1.commands.Command;
import com.example.demo1.commands.impl.SimpleCommand;
import com.example.demo1.operations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Scanner;

@Controller
public class DemoController {
    private final List<Operation> operations;

    public DemoController(List<Operation> operations) {
        this.operations = operations;
    }

    @GetMapping("/hello")
    public String hello(Model model,
                        @RequestParam("n")
                        String name
                        ) {
        Command c = new SimpleCommand(name);

        c.addArgument("text", new FileArgument("./file.txt"));

        for (Operation op : operations) {
            if (op.canDo(c)) {
                try {
                    model.addAttribute("message", op.process(c).toString());
                } catch (ValueNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        return "index.html";
    }
}
