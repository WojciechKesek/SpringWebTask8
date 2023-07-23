package com.example.springwebtasak8.controller;
import com.example.springwebtasak8.service.RandomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RandomRestController {
    private final RandomService service;
    @GetMapping("/api/random-boolean")
    public Boolean getBoolean(){
        return service.getValue();
    }
}
