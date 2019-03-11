package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.MarketSms;

public class MarketSmsFactory implements ISmsFactory {
    @Override
    public ISms createSms() {
        return new MarketSms();
    }
}
