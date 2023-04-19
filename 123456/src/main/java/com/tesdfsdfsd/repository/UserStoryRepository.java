package com.tesdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserStoryRepository extends JpaRepository<UserStory, Long>{
    @Query("SELECT u FROM UserStory u WHERE u.storyTitle = ?1")
    public UserStory findByStoryTitle(String storyTitle);

    @Query("SELECT u FROM UserStory u WHERE u.storyDescription = ?1")
    public UserStory findByDescription(String storyDescription);

    @Query("SELECT u FROM UserStory u WHERE u.assignedTeamMember = ?1")
    public UserStory findByTeamMember(String assignedTeamMember);
}