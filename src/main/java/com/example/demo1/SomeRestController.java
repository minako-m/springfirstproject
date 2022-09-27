package com.example.demo1;

import com.example.demo1.dto.RestResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRestController {
    @GetMapping("/hello_rest")
    public RestResult hello(@RequestParam("n")
                        String name
                        ) {
        return RestResult.builder()
                .name(name)
                .age(12)
                .build();
    }
}
