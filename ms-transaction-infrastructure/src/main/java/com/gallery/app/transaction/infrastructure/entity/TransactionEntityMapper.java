package com.gallery.app.transaction.infrastructure.entity;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.transaction.domain.model.TransactionDomain;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface TransactionEntityMapper {

	public TransactionDomain toDomain(TransactionEntity transactionEntity);
	
	public TransactionEntity toEntity(TransactionDomain transactionDomain);
	
	public List<TransactionDomain> asDomainList(List<TransactionEntity> transactionEntityList);
	
	//@Mapping(ignore = true, target = "transactionId")
	public TransactionEntity updateTransaction(TransactionDomain updateTransaction);
}
