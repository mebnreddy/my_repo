package com.bnreddy.exercises.service;

import org.springframework.stereotype.Service;

@Service
public class ExercisesService {

    public String add(String firstString, String secondString) {
        return String.valueOf(Long.parseLong(firstString) + Long.parseLong(secondString));
    }
}
