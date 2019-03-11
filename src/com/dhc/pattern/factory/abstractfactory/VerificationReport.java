package com.dhc.pattern.factory.abstractfactory;

public class VerificationReport implements IReport {
    @Override
    public void report() {
        System.out.println("接收到验证码的状态报告");
    }
}
