package com.tesdfsdfsd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String storyTitle;
	
	private String storyDescription;
	
	private String assignedTeamMember;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStoryTitle() {
		return storyTitle;
	}

	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}

	public String getStoryDescription() {
		return storyDescription;
	}

	public void setStoryDescription(String storyDescription) {
		this.storyDescription = storyDescription;
	}

	public String getAssignedTeamMember() {
		return assignedTeamMember;
	}

	public void setAssignedTeamMember(String assignedTeamMember) {
		this.assignedTeamMember = assignedTeamMember;
	}
	
	

}