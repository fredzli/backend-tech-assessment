package com.intuit.cg.backendtechassessment.bid;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository<Bid, String> {

	public List<Bid> findByProjectId(String projectId);
}
