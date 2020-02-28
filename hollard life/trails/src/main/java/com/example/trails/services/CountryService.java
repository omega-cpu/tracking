package com.example.trails.services;

import java.util.List;
import java.util.Optional;

import com.example.trails.models.Country;
import com.example.trails.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){

        return countryRepository.findAll();
        
    }

    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }
    
}