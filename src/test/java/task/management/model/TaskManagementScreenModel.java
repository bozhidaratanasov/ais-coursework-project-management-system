package task.management.model;

import models.Participant;
import models.Project;
import models.Status;
import taskmanagement.service.TaskManagementService;

public class TaskManagementScreenModel {
	
	private String name;
	private String description;
	private Participant participant;
	private Project project;
	private Status status;
	private String message;
	
	public TaskManagementScreenModel() {
		this.name = null;
		this.description = null;
		this.participant = null;
		this.project = null;
		this.status = null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void clickCreateTaskButton() {
		this.message = TaskManagementService.createTask(this.name, this.description, this.project);
	}
	
	public String getMessage() {
		return this.message;
	}

}
