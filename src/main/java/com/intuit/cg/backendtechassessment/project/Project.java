package com.intuit.cg.backendtechassessment.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id
	private String id;
	private String name;
	private String des;
	private String deadline;
	private String budget;
	
	public Project() {
		
	}
	
	public Project(String i, String n, String d, String l, String c) {
		super();
		this.id = i;
		this.name = n;
		this.des = d;
		this.deadline = l;
		this.budget = c;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String cost) {
		this.budget = cost;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

}

