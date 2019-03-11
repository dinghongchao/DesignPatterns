package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.MarketSms;

public class MarketSmsFactory implements ISmsFactory {
    @Override
    public void send() {
        MarketSms marketSms = new MarketSms();
        marketSms.send();
    }
}
