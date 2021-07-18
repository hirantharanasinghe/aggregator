package com.finance.aggregator.model;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVOICE")
public class Invoice implements Aggregatable{
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private UUID id;
	
	@Column(name = "INVOICE_ID")
	private String invoiceId;
	
	@Column(name="VALUE")
	private BigDecimal value;
	
	@Column(name = "CREATED_AT")
	private Long createdAt;

	
	public UUID getId () {
		return id;
	}

	
	public void setId ( UUID id ) {
		this.id = id;
	}

	
	public String getInvoiceId () {
		return invoiceId;
	}

	
	public void setInvoiceId ( String invoiceId ) {
		this.invoiceId = invoiceId;
	}

	
	public BigDecimal getValue () {
		return value;
	}

	
	public void setValue ( BigDecimal value ) {
		this.value = value;
	}

	
	public Long getCreatedAt () {
		return createdAt;
	}

	
	public void setCreatedAt ( Long createdAt ) {
		this.createdAt = createdAt;
	}

}
