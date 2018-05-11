package com.intuit.cg.backendtechassessment.bid;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.intuit.cg.backendtechassessment.project.Project;

@Entity
public class Bid {
	
	@Id
	private String id;
	
	private int amount;
	@ManyToOne
	private Project project;
	
	
	public Bid() {
		
	}
	
	public Bid(String i, String pid, int a) {
		super();
		this.id = i;
		this.project = new Project(pid, "", "", "", "");
		this.amount = a;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project p) {
		this.project = p;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int cost) {
		this.amount = cost;
	}

}

