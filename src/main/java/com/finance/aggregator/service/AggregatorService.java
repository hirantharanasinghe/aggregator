package com.finance.aggregator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.aggregator.model.Aggregatable;

@Service
public class AggregatorService {

	@Autowired
	private InvoiceService invoiceService;
	
	@Autowired
	private CreditNoteService creditNoteService;
	
	public List<Aggregatable> getAll(){
		List<Aggregatable> aggregatables = new ArrayList<Aggregatable>();
		aggregatables.addAll( invoiceService.findAllInvoices());
		aggregatables.addAll( creditNoteService.getAllCreditNotes() );
		return aggregatables;
	}
}
