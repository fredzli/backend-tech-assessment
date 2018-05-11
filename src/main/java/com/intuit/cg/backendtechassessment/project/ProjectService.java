package com.intuit.cg.backendtechassessment.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projRepository;

	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		projRepository.findAll().forEach(projects::add);
		return projects;
	}
	
	public Optional<Project> getProject(String id) {
		return projRepository.findById(id);
	}

	public void addProject(Project p) {
		projRepository.save(p);
	}
	
	public void updateProject(String id, Project p) {
		projRepository.save(p);
	}
	
	public void deleteProject(String id) {
		projRepository.deleteById(id);
	}
}
