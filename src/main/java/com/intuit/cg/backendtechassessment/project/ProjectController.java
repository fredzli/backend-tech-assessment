package com.intuit.cg.backendtechassessment.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService ps;
	
	@RequestMapping("/projects")
	public List<Project> getAllProjects() {
		return ps.getAllProjects();
	}
	
	@RequestMapping("/projects/{id}")
	public Optional<Project> getProject(@PathVariable String id) {
		return ps.getProject(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/projects")
	public void addProject(@RequestBody Project p) {
		ps.addProject(p);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/projects/{id}")
	public void updateProject(@PathVariable String id, @RequestBody Project p) {
		ps.updateProject(id, p);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/projects/{id}")
	public void deleteProject(@PathVariable String id) {
		ps.deleteProject(id);
	}
}
