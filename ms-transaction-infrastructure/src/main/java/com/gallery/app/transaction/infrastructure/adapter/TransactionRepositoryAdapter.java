package com.gallery.app.transaction.infrastructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gallery.app.transaction.domain.model.TransactionDomain;
import com.gallery.app.transaction.domain.port.RepositoryPort;
import com.gallery.app.transaction.infrastructure.entity.TransactionEntity;
import com.gallery.app.transaction.infrastructure.entity.TransactionEntityMapper;
import com.gallery.app.transaction.infrastructure.repository.TransactionRepository;

public class TransactionRepositoryAdapter implements RepositoryPort{

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private TransactionEntityMapper transactionMapper;
	
	@Override
	public Optional<TransactionDomain> saveTransaction(TransactionDomain transactionDomain) {
		return Optional.ofNullable(this.transactionMapper.toDomain(this.transactionRepository.save(this.transactionMapper.toEntity(transactionDomain))));
	}

	@Override
	public Optional<List<TransactionDomain>> getAllTransaction() {
		return Optional.ofNullable(this.transactionMapper.asDomainList(this.transactionRepository.findAll()));
	}

	@Override
	public Optional<TransactionDomain> getTransactionById(String transactionId) {
		return Optional.ofNullable(this.transactionMapper.toDomain(this.transactionRepository.findById(transactionId).get()));
	}

	@Override
	public void deleteTrasactionById(String transactionId) {
		this.transactionRepository.deleteById(transactionId);
	}

	@Override
	public Optional<TransactionDomain> updateTransaction(String transactionId, TransactionDomain transactionDomain) {
		TransactionEntity entity = this.transactionRepository.findById(transactionId).get();
	
		transactionDomain.setTransactionId(transactionId);
		entity = this.transactionMapper.updateTransaction(transactionDomain);
		
		return Optional.ofNullable(this.transactionMapper.toDomain(this.transactionRepository.save(entity)));
	}

	@Override
	public Optional<List<TransactionDomain>> getTransactionByArtwork(String artworkId) {
		return Optional.ofNullable(this.transactionMapper.asDomainList(this.transactionRepository.findByArtworkId(artworkId)));
	}

}
