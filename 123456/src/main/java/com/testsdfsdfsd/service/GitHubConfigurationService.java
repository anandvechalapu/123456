package com.testsdfsdfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdfsd.model.GitHubConfiguration;
import com.testsdfsdfsd.repository.GitHubConfigurationRepository;

@Service
public class GitHubConfigurationService {

    @Autowired
    private GitHubConfigurationRepository gitHubConfigurationRepository;

    public GitHubConfiguration findByGitHubUrlAndGitHubUsernameAndGitHubPasswordAndGitHubRepositoryName(String gitHubUrl, String gitHubUsername, String gitHubPassword, String gitHubRepositoryName) {
        return gitHubConfigurationRepository.findByGitHubUrlAndGitHubUsernameAndGitHubPasswordAndGitHubRepositoryName(gitHubUrl, gitHubUsername, gitHubPassword, gitHubRepositoryName);
    }

    public void deleteByGitHubUrl(String gitHubUrl) {
        gitHubConfigurationRepository.deleteByGitHubUrl(gitHubUrl);
    }

}