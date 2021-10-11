package com.example.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BANK_INFO")
public class Bank {
    @Id
    private String id;
    private String BANK_NAME;
    private String IFSC_CODE;
    private String BRANCH_NAME;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBANK_NAME() {
        return BANK_NAME;
    }

    public void setBANK_NAME(String BANK_NAME) {
        this.BANK_NAME = BANK_NAME;
    }

    public String getIFSC_CODE() {
        return IFSC_CODE;
    }

    public void setIFSC_CODE(String IFSC_CODE) {
        this.IFSC_CODE = IFSC_CODE;
    }

    public String getBRANCH_NAME() {
        return BRANCH_NAME;
    }

    public void setBRANCH_NAME(String BRANCH_NAME) {
        this.BRANCH_NAME = BRANCH_NAME;
    }
}
