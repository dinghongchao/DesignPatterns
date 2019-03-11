package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.VerificationCodeSms;

public class VerificationCodeSmsAbsFactory implements ISmsFactory {
    @Override
    public void send() {
        VerificationCodeSms codeSms = new VerificationCodeSms();
        codeSms.send();
    }

    @Override
    public void report() {
        System.out.println("验证码状态报告");
    }

    @Override
    public void uplink() {

    }
}
