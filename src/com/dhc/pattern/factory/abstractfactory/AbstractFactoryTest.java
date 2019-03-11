package com.dhc.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        MarketSmsAbsFactory marketSmsAbsFactory = new MarketSmsAbsFactory();
        marketSmsAbsFactory.send();
        marketSmsAbsFactory.report();
    }
}
