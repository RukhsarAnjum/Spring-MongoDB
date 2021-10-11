package com.example.mongoexample.controller;

import com.example.mongoexample.model.Bank;
import com.example.mongoexample.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/getBanks")
    List<Bank> getAllBanks(){
        return bankService.getBanks();
    }


    @PostMapping("/createBanks")
    public Bank createBank(@RequestBody Bank newBank){
        return bankService.createBank(newBank);

    }
}
