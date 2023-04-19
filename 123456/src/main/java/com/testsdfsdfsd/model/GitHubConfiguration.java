package com.testsdfsdfsd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GitHubConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "git_hub_url")
    private String gitHubUrl;

    @Column(name = "git_hub_username")
    private String gitHubUsername;

    @Column(name = "git_hub_password")
    private String gitHubPassword;

    @Column(name = "git_hub_repository_name")
    private String gitHubRepositoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }

    public String getGitHubUsername() {
        return gitHubUsername;
    }

    public void setGitHubUsername(String gitHubUsername) {
        this.gitHubUsername = gitHubUsername;
    }

    public String getGitHubPassword() {
        return gitHubPassword;
    }

    public void setGitHubPassword(String gitHubPassword) {
        this.gitHubPassword = gitHubPassword;
    }

    public String getGitHubRepositoryName() {
        return gitHubRepositoryName;
    }

    public void setGitHubRepositoryName(String gitHubRepositoryName) {
        this.gitHubRepositoryName = gitHubRepositoryName;
    }
}