package com.example.demo.controller.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class jounral_ent {
	
	private int TaskId;
	private String TaskName;
	private String TaskDescription;
	private String TaskDate;
	private String CreatedBy;
	private String CreatedTS;
	public int getTaskId() {
		return TaskId;
	}
	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public String getTaskDescription() {
		return TaskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		TaskDescription = taskDescription;
	}
	public String getTaskDate() {
		return TaskDate;
	}
	public void setTaskDate(String taskDate) {
		TaskDate = taskDate;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public String getCreatedTS() {
		return CreatedTS;
	}
	public void setCreatedTS(String createdTS) {
		CreatedTS = createdTS;
	}

}
