package com.tesdfsdfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesdfsdfsd.repository.JiraToJavaRepository;

@Service
public class JiraToJavaService {

    @Autowired
    private JiraToJavaRepository jiraToJavaRepository;

    // API to get Jira connection
    public Object getJiraConnection(String jiraConnection) {
        return jiraToJavaRepository.getJiraConnection(jiraConnection);
    }

    // API to get project
    public Object getProject(String project) {
        return jiraToJavaRepository.getProject(project);
    }

    // API to get microservice implementation type
    public Object getMicroserviceImplementationType(String microserviceImplementationType) {
        return jiraToJavaRepository.getMicroserviceImplementationType(microserviceImplementationType);
    }

    // API to get user stories
    public List<Object> getUserStories(String userStories) {
        return jiraToJavaRepository.getUserStories(userStories);
    }

    // API to get type of java code
    public Object getTypeOfJavaCode(String typeOfJavaCode) {
        return jiraToJavaRepository.getTypeOfJavaCode(typeOfJavaCode);
    }

    // API to get GitHub
    public Object getGitHub(String gitHub) {
        return jiraToJavaRepository.getGitHub(gitHub);
    }

    // API to get repository name
    public Object getRepositoryName(String repositoryName) {
        return jiraToJavaRepository.getRepositoryName(repositoryName);
    }

    // API to generate code
    public Object generateCode() {
        return jiraToJavaRepository.generateCode();
    }

}