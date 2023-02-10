package com.gallery.app.transaction.application.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.transaction.domain.model.TransactionDomain;
import com.transaction.app.application.rest.model.TransactionDto;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface TransactionMapper {
	
	public TransactionDto toDto(TransactionDomain transactionDomain);
	
	public TransactionDomain toDomain(TransactionDto trasactionDto);
	
	public List<TransactionDto> asListDto(List<TransactionDomain> transactionDomainList);

}
