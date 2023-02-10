package com.gallery.app.transaction.infrastructure.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gallery.app.transaction.domain.common.TransactionTypeEnum;

import lombok.Data;

@Data
@Document(collection = "transaction")
public class TransactionEntity {
	
	@Id
	private String transactionId;
	private TransactionTypeEnum transactionType;
	private Double price;
	private LocalDate date;
	private String artworkId;
}
