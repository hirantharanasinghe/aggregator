package com.finance.aggregator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.aggregator.model.Invoice;
import com.finance.aggregator.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public List<Invoice> findAllInvoices(){
		return invoiceRepository.findAll();
	}
}
