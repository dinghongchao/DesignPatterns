package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.VerificationCodeSms;

public class VerificationCodeSmsFactory implements ISmsFactory {
    @Override
    public void send() {
        VerificationCodeSms codeSms = new VerificationCodeSms();
        codeSms.send();
    }
}
