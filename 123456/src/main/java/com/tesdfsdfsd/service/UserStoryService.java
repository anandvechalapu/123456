package com.tesdfsdfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesdfsdfsd.model.UserStory;
import com.tesdfsdfsd.repository.UserStoryRepository;

@Service
public class UserStoryService {
    @Autowired
    private UserStoryRepository userStoryRepository;

    public UserStory findByStoryTitle(String storyTitle) {
        return userStoryRepository.findByStoryTitle(storyTitle);
    }

    public UserStory findByDescription(String storyDescription) {
        return userStoryRepository.findByDescription(storyDescription);
    }

    public UserStory findByTeamMember(String assignedTeamMember) {
        return userStoryRepository.findByTeamMember(assignedTeamMember);
    }

    public List<UserStory> findAll() {
        return userStoryRepository.findAll();
    }

    public UserStory save(UserStory userStory) {
        return userStoryRepository.save(userStory);
    }

    public void delete(UserStory userStory) {
        userStoryRepository.delete(userStory);
    }
}