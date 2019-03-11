package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.NoticeSms;

public class NoticeSmsAbsFactory implements ISmsFactory {

    @Override
    public ISms createSms() {
        return new NoticeSms();
    }

    @Override
    public IReport createReport() {
        return new NoticeReport();
    }
}
