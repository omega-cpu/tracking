package com.example.trails.controllers;

import java.util.List;

import com.example.trails.models.Capital;
import com.example.trails.services.CapitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapitalController {

    @Autowired
    private CapitalService capitalService;
    @GetMapping("/capitals")
    public String getCapital(Model model){
        List<Capital> capitalList = capitalService.getCapitals();
        model.addAttribute("capitals", capitalList);
        return "capital";
    }
    
}