package com.dhc.pattern.factory;

public class MarketSms implements ISms {
    @Override
    public void send() {
        System.out.println("发送营销短信");
    }
}
