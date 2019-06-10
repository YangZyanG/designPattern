package com.example.designpattern.demo.template.concreteTemplate;

import com.example.designpattern.demo.template.abstractTemplate.Account;

public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
