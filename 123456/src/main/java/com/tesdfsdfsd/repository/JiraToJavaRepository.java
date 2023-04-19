package com.tesdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JiraToJavaRepository extends JpaRepository<Object, Long> {

    // API to get Jira connection
    Object getJiraConnection(String jiraConnection);

    // API to get project
    Object getProject(String project);

    // API to get microservice implementation type
    Object getMicroserviceImplementationType(String microserviceImplementationType);

    // API to get user stories
    Object getUserStories(String userStories);

    // API to get type of java code
    Object getTypeOfJavaCode(String typeOfJavaCode);

    // API to get GitHub
    Object getGitHub(String gitHub);

    // API to get repository name
    Object getRepositoryName(String repositoryName);

    // API to generate code
    Object generateCode();

}