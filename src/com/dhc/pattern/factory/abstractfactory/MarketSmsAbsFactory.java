package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.MarketSms;

public class MarketSmsAbsFactory implements ISmsFactory {
    @Override
    public void send() {
        MarketSms marketSms = new MarketSms();
        marketSms.send();
    }

    @Override
    public void report() {
        System.out.println("营销短信状态报告");
    }

    @Override
    public void uplink() {
        System.out.println("营销短信上行");
    }
}
