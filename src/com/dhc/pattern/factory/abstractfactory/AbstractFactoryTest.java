package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.ISms;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        MarketSmsAbsFactory marketSmsAbsFactory = new MarketSmsAbsFactory();
        ISms sms =  marketSmsAbsFactory.createSms();
        sms.send();
        IReport report = marketSmsAbsFactory.createReport();
        report.report();
    }
}
