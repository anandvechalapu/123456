package com.tesdfsdfsd.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesdfsdfsd.model.JiraToJava;
import com.tesdfsdfsd.model.UserStory;
import com.tesdfsdfsd.service.JiraToJavaService;
import com.tesdfsdfsd.service.UserStoryService;

@RestController
@RequestMapping("/jira-to-java")
public class JiraToJavaController {

    @Autowired
    private JiraToJavaService jiraToJavaService;

    @Autowired
    private UserStoryService userStoryService;

    // API to get Jira connection
    @GetMapping("/jira-connection/{jiraConnection}")
    public Object getJiraConnection(@PathVariable(value = "jiraConnection") String jiraConnection) {
        return jiraToJavaService.getJiraConnection(jiraConnection);
    }

    // API to get project
    @GetMapping("/project/{project}")
    public Object getProject(@PathVariable(value = "project") String project) {
        return jiraToJavaService.getProject(project);
    }

    // API to get microservice implementation type
    @GetMapping("/microservice-implementation-type/{microserviceImplementationType}")
    public Object getMicroserviceImplementationType(
            @PathVariable(value = "microserviceImplementationType") String microserviceImplementationType) {
        return jiraToJavaService.getMicroserviceImplementationType(microserviceImplementationType);
    }

    // API to get user stories
    @GetMapping("/user-stories/{userStories}")
    public List<Object> getUserStories(@PathVariable(value = "userStories") String userStories) {
        return jiraToJavaService.getUserStories(userStories);
    }

    // API to get type of java code
    @GetMapping("/type-of-java-code/{typeOfJavaCode}")
    public Object getTypeOfJavaCode(@PathVariable(value = "typeOfJavaCode") String typeOfJavaCode) {
        return jiraToJavaService.getTypeOfJavaCode(typeOfJavaCode);
    }

    // API to get GitHub
    @GetMapping("/git-hub/{gitHub}")
    public Object getGitHub(@PathVariable(value = "gitHub") String gitHub) {
        return jiraToJavaService.getGitHub(gitHub);
    }

    // API to get repository name
    @GetMapping("/repository-name/{repositoryName}")
    public Object getRepositoryName(@PathVariable(value = "repositoryName") String repositoryName) {
        return jiraToJavaService.getRepositoryName(repositoryName);
    }

    // API to generate code
    @GetMapping("/generate-code")
    public Object generateCode() {
        return jiraToJavaService.generateCode();
    }

    // API to create a user story
    @PostMapping("/user-story")
    public UserStory createUserStory(@Valid @RequestBody UserStory userStory) {
        return userStoryService.save(userStory);
    }

    // API to get user story by id
    @GetMapping("/user-story/{id}")
    public ResponseEntity<UserStory> getUserStoryById(@PathVariable(value = "id") Long userStoryId)