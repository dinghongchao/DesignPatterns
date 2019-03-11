package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.VerificationCodeSms;

public class VerificationCodeSmsAbsFactory implements ISmsFactory {

    @Override
    public ISms createSms() {
        return new VerificationCodeSms();
    }

    @Override
    public IReport createReport() {
        return new VerificationReport();
    }
}
