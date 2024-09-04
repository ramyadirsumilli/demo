package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPost() {
       String url = "https://jsonplaceholder.typicode.com/posts";
       Post[] posts = restTemplate.getForObject(url, Post[].class);
       return new ResponseEntity<>(Arrays.asList(posts), HttpStatus.OK);
    }
}
