package com.example.designpattern.demo.template.abstractTemplate;

public abstract class Account {

    /***
     * 模板方法，计算利息数额
     * @return 顶级思路
     */
    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }


    /***
     * 判断账号类型，基本方法留给子类实现
     * @return
     */
    protected abstract String doCalculateAccountType();

    /***
     * 计算利息百分比，基本方法留给子类实现
     * @return
     */
    protected abstract double doCalculateInterestRate();

    /***
     * 根据账号类型返回余额，基本方法，已经实现
     * @param accountType
     * @return
     */
    private double calculateAmount(String accountType){

        //省略业务逻辑
        return 1234;
    }
}
