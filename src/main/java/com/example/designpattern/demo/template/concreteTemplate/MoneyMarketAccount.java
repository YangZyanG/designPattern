package com.example.designpattern.demo.template.concreteTemplate;

import com.example.designpattern.demo.template.abstractTemplate.Account;

public class MoneyMarketAccount extends Account {


    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
