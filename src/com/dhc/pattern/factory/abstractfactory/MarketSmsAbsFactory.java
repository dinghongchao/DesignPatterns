package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.MarketSms;

public class MarketSmsAbsFactory implements ISmsFactory {

    @Override
    public ISms createSms() {
        return new MarketSms();
    }

    @Override
    public IReport createReport() {
        return new MarketReport();
    }
}
