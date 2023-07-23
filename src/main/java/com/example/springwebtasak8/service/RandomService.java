package com.example.springwebtasak8.service;

import com.example.springwebtasak8.modelDTO.RandomBooleanProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RandomService {

    private final RandomBooleanProvider provider;

    public Boolean getValue(){
        return provider.getValue();
    }
}
