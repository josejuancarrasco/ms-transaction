package com.gallery.app.transaction.domain.model;

import java.time.LocalDate;

import com.gallery.app.transaction.domain.common.TransactionTypeEnum;

import lombok.Data;

@Data
public class TransactionDomain {
	
	private String transactionId;
	
	private TransactionTypeEnum transactionType;
	
	private Double price;
	
	private LocalDate date;
	
	private String artworkId;
	
}
