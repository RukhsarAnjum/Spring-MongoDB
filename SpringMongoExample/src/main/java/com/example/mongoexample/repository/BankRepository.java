package com.example.mongoexample.repository;


import com.example.mongoexample.model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<Bank, String> {
}