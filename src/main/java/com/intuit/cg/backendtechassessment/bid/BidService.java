package com.intuit.cg.backendtechassessment.bid;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {

	@Autowired
	private BidRepository bidRepository;

	public List<Bid> getAllBids(String projectId) {
		List<Bid> bids = new ArrayList<>();
		bidRepository.findByProjectId(projectId).forEach(bids::add);
		return bids;
	}
	
	public Optional<Bid> getBid(String id) {
		return bidRepository.findById(id);
	}

	public void addBid(Bid p) {
		bidRepository.save(p);
	}
	
	public void updateBid(Bid p) {
		bidRepository.save(p);
	}
	
	public void deleteBid(String id) {
		bidRepository.deleteById(id);
	}
}
