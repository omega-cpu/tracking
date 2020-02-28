package com.example.trails.services;

import java.util.List;

import com.example.trails.models.Capital;
import com.example.trails.repositories.CapitalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CapitalService {
    
    @Autowired
    private CapitalRepository capitalRepository;

    public List<Capital> getCapitals(){
        return capitalRepository.findAll();
    }
}