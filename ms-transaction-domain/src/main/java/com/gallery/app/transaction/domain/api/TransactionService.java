package com.gallery.app.transaction.domain.api;

import java.util.List;
import java.util.Optional;

import com.gallery.app.transaction.domain.model.TransactionDomain;

public interface TransactionService {
	
	public Optional<TransactionDomain> saveTransaction(TransactionDomain transactionDomain);
	
	public Optional<List<TransactionDomain>> getAllTransaction();
	
	public Optional<TransactionDomain> getTransactionById(String transactionId);
	
	public void deleteTrasactionById(String transactionId);
	
	public Optional<TransactionDomain> updateTransaction(String transactionId, TransactionDomain transactionDomain);

	public Optional<List<TransactionDomain>> getTransactionByArtwork(String artworkId);
}
