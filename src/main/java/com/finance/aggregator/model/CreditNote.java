package com.finance.aggregator.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT_NOTE")
public class CreditNote implements Aggregatable{
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private UUID id;
	
	@Column(name="CREDIT_NUMBER")
	private String creditNumber;
	
	@Column(name="VALUE")
	private BigDecimal value;
	
	@Column(name="CREATED_AT")
	private Long createdAt;

	
	public UUID getId () {
		return id;
	}

	
	public void setId ( UUID id ) {
		this.id = id;
	}

	
	public String getCreditNumber () {
		return creditNumber;
	}

	
	public void setCreditNumber ( String creditNumber ) {
		this.creditNumber = creditNumber;
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
