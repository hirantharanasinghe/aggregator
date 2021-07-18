package com.finance.aggregator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.aggregator.model.Aggregatable;
import com.finance.aggregator.service.AggregatorService;

@RestController
@RequestMapping("/aggregator")
public class AggregatorController {
	
	@Autowired
	private AggregatorService aggregatorService;
	
	@GetMapping(path="/all", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<Aggregatable> getAggregatedData(){
		return aggregatorService.getAll();
	}

}
