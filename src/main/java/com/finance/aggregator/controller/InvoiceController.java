package com.finance.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.finance.aggregator.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
}
