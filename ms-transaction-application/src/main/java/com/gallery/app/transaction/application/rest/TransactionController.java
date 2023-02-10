package com.gallery.app.transaction.application.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.gallery.app.transaction.application.mapper.TransactionMapper;
import com.gallery.app.transaction.domain.api.TransactionService;
import com.transaction.app.application.rest.api.TransactionApi;
import com.transaction.app.application.rest.model.TransactionDto;

@RestController
public class TransactionController implements TransactionApi {

	private final TransactionService transactionService;

	private final TransactionMapper transactionMapper;

	public TransactionController(TransactionService trasactionService, TransactionMapper transactionMapper) {
		this.transactionService = trasactionService;
		this.transactionMapper = transactionMapper;
	}

	@Override
	public ResponseEntity<Void> deleteTransactionById(String transactionId) {
		this.transactionService.deleteTrasactionById(transactionId);
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<List<TransactionDto>> findAllTransaction() {
		final Optional<List<TransactionDto>> transactionListDto = Optional
				.ofNullable(this.transactionMapper.asListDto(this.transactionService.getAllTransaction().get()));
		return transactionListDto.map(o -> ResponseEntity.ok(transactionListDto.get()))
				.orElse(ResponseEntity.notFound().build());
	}

	@Override
	public ResponseEntity<TransactionDto> getTransactionById(String transactionId) {
		final Optional<TransactionDto> transactionDto = Optional.ofNullable(
				this.transactionMapper.toDto(this.transactionService.getTransactionById(transactionId).get()));
		return transactionDto.map(o -> ResponseEntity.ok(transactionDto.get()))
				.orElse(ResponseEntity.notFound().build());
	}

	@Override
	public ResponseEntity<TransactionDto> saveTransaction(TransactionDto transactionDto) {
		final Optional<TransactionDto> transactionSaved = Optional.ofNullable(this.transactionMapper.toDto( this.transactionService.saveTransaction( this.transactionMapper.toDomain(transactionDto)).get()));
		return transactionSaved.map( o -> ResponseEntity.ok( transactionSaved.get())).orElse(ResponseEntity.badRequest().build());
	}

	@Override
	public ResponseEntity<TransactionDto> updateTransaction(String transactionId, TransactionDto transactionDto) {
		final Optional<TransactionDto> transactionSaved = Optional.ofNullable(this.transactionMapper.toDto( this.transactionService.updateTransaction(transactionId, this.transactionMapper.toDomain(transactionDto)).get()));
		return transactionSaved.map( o -> ResponseEntity.ok( transactionSaved.get())).orElse(ResponseEntity.badRequest().build());
	}
	
	@Override
	public  ResponseEntity<List<TransactionDto>> getTransactionkByArtwork(String artworkId){
		final Optional<List<TransactionDto>> transactionListDto = Optional
				.ofNullable(this.transactionMapper.asListDto(this.transactionService.getTransactionByArtwork(artworkId).get()));
		return transactionListDto.map(o -> ResponseEntity.ok(transactionListDto.get()))
				.orElse(ResponseEntity.notFound().build());
	}

}
