package com.tarun.gymtracker.exercise.controller;

import com.tarun.gymtracker.exercise.dto.CreateExerciseRequest;
import com.tarun.gymtracker.exercise.entity.Exercise;
import com.tarun.gymtracker.exercise.service.ExerciseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
@CrossOrigin(origins = "http://localhost:5173")
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(
            ExerciseService exerciseService
    ) {
        this.exerciseService = exerciseService;
    }

    @PostMapping
    public Exercise createExercise(
            @RequestBody CreateExerciseRequest request
    ) {
        return exerciseService.createExercise(request);
    }

    @GetMapping
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @GetMapping("/search")
    public List<Exercise> searchExercises(
            @RequestParam String keyword
    ) {
        return exerciseService.searchExercises(keyword);
    }
}