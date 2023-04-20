package com.testsdfsdfsd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdfsd.model.CustomWorkout;
import com.testsdfsdfsd.repository.CustomWorkoutRepository;

@Service
public class CustomWorkoutService {

    @Autowired
    private CustomWorkoutRepository customWorkoutRepository;

    public Optional<CustomWorkout> getCustomWorkoutById(Long id) {
        return customWorkoutRepository.findById(id);
    }

    public CustomWorkout getCustomWorkoutByName(String name) {
        return customWorkoutRepository.findByName(name);
    }

    public List<CustomWorkout> getAllCustomWorkouts() {
        return customWorkoutRepository.findAll();
    }

    public void saveCustomWorkout(CustomWorkout customWorkout) {
        customWorkoutRepository.save(customWorkout);
    }

    public void deleteCustomWorkout(CustomWorkout customWorkout) {
        customWorkoutRepository.delete(customWorkout);
    }

}