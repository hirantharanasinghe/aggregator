package com.finance.aggregator.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.finance.aggregator.model.CreditNote;

@Repository
public interface CreditNoteRepository extends JpaRepository<CreditNote, UUID> {

}
