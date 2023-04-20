package com.testsdfsdfsd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdfsd.dto.MailMasterDto;
import com.testsdfsdfsd.model.CustomWorkout;
import com.testsdfsdfsd.service.CustomWorkoutService;
import com.testsdfsdfsd.service.MailService;

@RestController
@RequestMapping("/api")
public class CustomWorkoutController {

    @Autowired
    private CustomWorkoutService customWorkoutService;
    
    @Autowired
    private MailService mailService;

    @GetMapping("/customworkouts")
    public List<CustomWorkout> getAllCustomWorkouts() {
        return customWorkoutService.getAllCustomWorkouts();
    }

    @GetMapping("/customworkouts/{id}")
    public Optional<CustomWorkout> getCustomWorkoutById(@PathVariable Long id) {
        return customWorkoutService.getCustomWorkoutById(id);
    }

    @PostMapping("/customworkouts")
    public CustomWorkout saveCustomWorkout(@RequestBody CustomWorkout customWorkout) {
        return customWorkoutService.saveCustomWorkout(customWorkout);
    }

    @PutMapping("/customworkouts/{id}")
    public CustomWorkout updateCustomWorkout(@PathVariable Long id, @RequestBody CustomWorkout customWorkout) {
        return customWorkoutService.saveCustomWorkout(customWorkout);
    }

    @DeleteMapping("/customworkouts/{id}")
    public void deleteCustomWorkout(@PathVariable Long id) {
        Optional<CustomWorkout> customWorkout = customWorkoutService.getCustomWorkoutById(id);
        customWorkoutService.deleteCustomWorkout(customWorkout.get());
    }
    
    @PostMapping("/mailsend")
    public boolean sendMail(@RequestBody MailMasterDto mailMasterDto) {
    	return mailService.createAndSendEmail(mailMasterDto);
    }
    
    @GetMapping("/mailsuccess")
    public String getSuccessMessage() {
    	return mailService.getSuccessMessage();
    }
}