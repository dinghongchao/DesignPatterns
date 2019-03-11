package com.dhc.pattern.factory;

public class VerificationCodeSms implements ISms {
    @Override
    public void send() {
        System.out.println("发送验证码短信");
    }
}
