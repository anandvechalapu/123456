@Repository
package com.testsdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testsdfsdfsd.model.CustomWorkout;

public interface CustomWorkoutRepository extends JpaRepository<CustomWorkout, Long> {
    
    CustomWorkout findByName(String name);
    CustomWorkout findById(Long id);
    void save(CustomWorkout customWorkout);
    void delete(CustomWorkout customWorkout);
    List<CustomWorkout> findAll();

}