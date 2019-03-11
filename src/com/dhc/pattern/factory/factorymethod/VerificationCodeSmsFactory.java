package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.VerificationCodeSms;

public class VerificationCodeSmsFactory implements ISmsFactory {
    @Override
    public ISms createSms() {
        return new VerificationCodeSms();
    }
}
