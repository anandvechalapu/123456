package com.tesdfsdfsd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JiraToJava {

    @Id
    private Long id;

    private String jiraConnection;
    private String project;
    private String microserviceImplementationType;
    private String userStories;
    private String typeOfJavaCode;
    private String gitHub;
    private String repositoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJiraConnection() {
        return jiraConnection;
    }

    public void setJiraConnection(String jiraConnection) {
        this.jiraConnection = jiraConnection;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getMicroserviceImplementationType() {
        return microserviceImplementationType;
    }

    public void setMicroserviceImplementationType(String microserviceImplementationType) {
        this.microserviceImplementationType = microserviceImplementationType;
    }

    public String getUserStories() {
        return userStories;
    }

    public void setUserStories(String userStories) {
        this.userStories = userStories;
    }

    public String getTypeOfJavaCode() {
        return typeOfJavaCode;
    }

    public void setTypeOfJavaCode(String typeOfJavaCode) {
        this.typeOfJavaCode = typeOfJavaCode;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}