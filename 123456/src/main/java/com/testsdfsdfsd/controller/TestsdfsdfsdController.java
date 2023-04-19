package com.testsdfsdfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdfsd.model.GitHubConfiguration;
import com.testsdfsdfsd.model.User;
import com.testsdfsdfsd.service.GitHubConfigurationService;
import com.testsdfsdfsd.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class TestsdfsdfsdController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private GitHubConfigurationService gitHubConfigurationService;

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }
    
    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @DeleteMapping("/user/{username}")
    public void deleteByUsername(@PathVariable String username) {
        userService.deleteByUsername(username);
    }
    
    @GetMapping("/gitHubConfiguration/{gitHubUrl}")
    public GitHubConfiguration findByGitHubUrlAndGitHubUsernameAndGitHubPasswordAndGitHubRepositoryName(@PathVariable String gitHubUrl, String gitHubUsername, String gitHubPassword, String gitHubRepositoryName) {
        return gitHubConfigurationService.findByGitHubUrlAndGitHubUsernameAndGitHubPasswordAndGitHubRepositoryName(gitHubUrl, gitHubUsername, gitHubPassword, gitHubRepositoryName);
    }
    
    @DeleteMapping("/gitHubConfiguration/{gitHubUrl}")
    public void deleteByGitHubUrl(@PathVariable String gitHubUrl) {
        gitHubConfigurationService.deleteByGitHubUrl(gitHubUrl);
    }
}