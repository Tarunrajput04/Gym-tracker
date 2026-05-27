package com.tarun.gymtracker.exercise.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateExerciseRequest {

    private String name;
    private String muscleGroup;
}