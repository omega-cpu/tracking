package com.example.trails.services;

import java.util.List;
import java.util.Optional;

import com.example.trails.models.State;
import com.example.trails.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;
    
    public List<State> getStates(){

        return stateRepository.findAll();
        
    }

    
    public Optional<State> findById(int id){
        
        return stateRepository.findById(id);
    }
}