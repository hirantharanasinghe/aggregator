package com.finance.aggregator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.aggregator.model.CreditNote;
import com.finance.aggregator.repository.CreditNoteRepository;

@Service
public class CreditNoteService {

	@Autowired
	private CreditNoteRepository creditNoteRepository;
	
	public List<CreditNote> getAllCreditNotes(){
		return creditNoteRepository.findAll();
	}
}
