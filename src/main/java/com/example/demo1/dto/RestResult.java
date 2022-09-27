package com.example.demo1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestResult {
    private String name;
    private int age;
}
