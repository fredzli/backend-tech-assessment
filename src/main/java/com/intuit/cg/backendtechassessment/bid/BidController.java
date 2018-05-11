package com.intuit.cg.backendtechassessment.bid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.cg.backendtechassessment.project.Project;

@RestController
public class BidController {

	@Autowired
	private BidService bidService;
	
	@RequestMapping("/projects/{projectId}/bids")
	public List<Bid> getAllBids(@PathVariable String projectId) {
		return bidService.getAllBids(projectId);
	}
	
	@RequestMapping("/projects/{projectId}/bids/{id}")
	public Optional<Bid> getBid(@PathVariable String id) {
		return bidService.getBid(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/projects/{projectId}/bids")
	public void addBid(@RequestBody Bid bid, @PathVariable String projectId) {
		bid.setProject(new Project(projectId, "", "", "", ""));
		bidService.addBid(bid);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/projects/{projectId}/bids/{id}")
	public void updateBid(@PathVariable String id, @PathVariable String projectId, @RequestBody Bid bid) {
		bid.setProject(new Project(projectId, "", "", "", ""));   
		bidService.updateBid(bid);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/projects/{projectId}/bids/{id}")
	public void deleteBid(@PathVariable String id) {
		bidService.deleteBid(id);
	}
}
