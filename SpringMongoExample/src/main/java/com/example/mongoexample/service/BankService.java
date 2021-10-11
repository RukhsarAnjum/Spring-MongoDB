package com.example.mongoexample.service;

import com.example.mongoexample.model.Bank;
import com.example.mongoexample.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public List<Bank> getBanks() {

        return bankRepository.findAll();
    }

    public Bank createBank(Bank bank){
        return (Bank) bankRepository.insert(bank);
    }
}
