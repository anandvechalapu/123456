package com.testsdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testsdfsdfsd.model.GitHubConfiguration;

@Repository
public interface GitHubConfigurationRepository extends JpaRepository<GitHubConfiguration, Long> {
    GitHubConfiguration findByGitHubUrlAndGitHubUsernameAndGitHubPasswordAndGitHubRepositoryName(String gitHubUrl, String gitHubUsername, String gitHubPassword, String gitHubRepositoryName);

    void deleteByGitHubUrl(String gitHubUrl);
}