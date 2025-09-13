package com.bnreddy.exercises.controller;

import com.bnreddy.exercises.service.ExercisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/exercises")
public class ExercisesController {

    @Autowired
    ExercisesService service;

    @GetMapping("/addTwoStringNumbers/{firstString}/{secondString}")
    public String add(@PathVariable String firstString, @PathVariable String secondString){
        return service.add(firstString, secondString);
    }
}
