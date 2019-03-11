package com.dhc.pattern.factory;

public class NoticeSms implements ISms {
    @Override
    public void send() {
        System.out.println("发送通知短信");
    }
}
