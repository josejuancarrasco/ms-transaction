package com.gallery.app.transaction.infrastructure.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gallery.app.transaction.infrastructure.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends MongoRepository<TransactionEntity, String> {

	public List<TransactionEntity> findByArtworkId(String artworkId);
}
