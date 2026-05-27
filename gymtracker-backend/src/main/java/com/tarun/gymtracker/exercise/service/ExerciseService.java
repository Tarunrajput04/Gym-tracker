package com.tarun.gymtracker.exercise.service;

import com.tarun.gymtracker.exercise.dto.CreateExerciseRequest;
import com.tarun.gymtracker.exercise.entity.Exercise;
import com.tarun.gymtracker.exercise.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(CreateExerciseRequest request) {

        Exercise exercise = new Exercise();

        exercise.setName(request.getName());
        exercise.setMuscleGroup(request.getMuscleGroup());

        return exerciseRepository.save(exercise);
    }

    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    public List<Exercise> searchExercises(String keyword) {
        return exerciseRepository.findByNameContainingIgnoreCase(keyword);
    }
}