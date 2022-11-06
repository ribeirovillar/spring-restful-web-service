package com.example.springrestfulwebservice.models;

import lombok.Data;

@Data
public class Greeting {
    private final long id;
    private final String content;
}
