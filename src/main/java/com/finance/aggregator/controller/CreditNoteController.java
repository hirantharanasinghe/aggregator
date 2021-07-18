package com.finance.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.finance.aggregator.service.CreditNoteService;

@RestController
public class CreditNoteController {

	@Autowired
	private CreditNoteService creditNoteService;
}
