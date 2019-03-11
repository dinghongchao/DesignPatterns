package com.dhc.pattern.factory.abstractfactory;

public class MarketReport implements IReport {
    @Override
    public void report() {
        System.out.println("接收到营销状态报告");
    }
}
