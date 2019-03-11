package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.ISms;

public interface ISmsFactory {

    ISms createSms();

    IReport createReport();
}
