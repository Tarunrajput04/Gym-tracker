package com.tarun.gymtracker.exercise.repository;

import com.tarun.gymtracker.exercise.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    List<Exercise> findByNameContainingIgnoreCase(String name);
}