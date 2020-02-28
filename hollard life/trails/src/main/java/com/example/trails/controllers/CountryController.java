package com.example.trails.controllers;

import java.util.List;
import java.util.Optional;

import com.example.trails.models.Country;
import com.example.trails.services.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountry(Model model){

        List<Country> countrylist = countryService.getCountries();
        model.addAttribute("countries", countrylist);
        return "country";
    }
    
    @RequestMapping("countries/findByid")
    @ResponseBody
    public Optional<Country> findById(int id){
        return countryService.findById(id);
    }
}