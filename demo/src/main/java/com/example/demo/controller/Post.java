package com.example.demo.controller;

import lombok.Data;

@Data
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}
