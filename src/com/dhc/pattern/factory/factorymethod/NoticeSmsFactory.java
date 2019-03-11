package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.NoticeSms;

public class NoticeSmsFactory implements ISmsFactory {

    @Override
    public ISms createSms() {
        return new NoticeSms();
    }
}
