package com.example.trails.controllers;

import java.util.List;
import java.util.Optional;

import com.example.trails.models.State;
import com.example.trails.services.StateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StateController {
    @Autowired
private StateService stateService;

@GetMapping("/states")
public String getState(Model model){

    List<State> statelist = stateService.getStates();
    model.addAttribute("states", statelist);
    return "state";
}

    @RequestMapping("states/findByid")
    @ResponseBody
    public Optional<State> findById(int id){
        return stateService.findById(id);
    }
}