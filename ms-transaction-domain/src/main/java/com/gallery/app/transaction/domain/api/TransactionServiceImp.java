package com.gallery.app.transaction.domain.api;

import java.util.List;
import java.util.Optional;

import com.gallery.app.transaction.domain.model.TransactionDomain;
import com.gallery.app.transaction.domain.port.RepositoryPort;

public class TransactionServiceImp implements TransactionService{
	
	private final RepositoryPort repositoryPort;
	
	public TransactionServiceImp(RepositoryPort repositoryPort) {
		this.repositoryPort = repositoryPort;
	}

	@Override
	public Optional<TransactionDomain> saveTransaction(TransactionDomain transactionDomain) {
		return this.repositoryPort.saveTransaction(transactionDomain);
	}

	@Override
	public Optional<List<TransactionDomain>> getAllTransaction() {
		return this.repositoryPort.getAllTransaction();
	}

	@Override
	public Optional<TransactionDomain> getTransactionById(String transactionId) {
		return this.repositoryPort.getTransactionById(transactionId);
	}

	@Override
	public void deleteTrasactionById(String transactionId) {
		this.repositoryPort.deleteTrasactionById(transactionId);
	}

	@Override
	public Optional<TransactionDomain> updateTransaction(String transactionId, TransactionDomain transactionDomain) {
		return this.repositoryPort.updateTransaction(transactionId, transactionDomain);
	}

	@Override
	public Optional<List<TransactionDomain>> getTransactionByArtwork(String artworkId) {
		return this.repositoryPort.getTransactionByArtwork(artworkId);
	}

}
