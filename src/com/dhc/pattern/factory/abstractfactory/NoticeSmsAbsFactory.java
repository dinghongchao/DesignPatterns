package com.dhc.pattern.factory.abstractfactory;

import com.dhc.pattern.factory.NoticeSms;

public class NoticeSmsAbsFactory implements ISmsFactory {
    @Override
    public void send() {
        NoticeSms noticeSms = new NoticeSms();
        noticeSms.send();
    }

    @Override
    public void report() {
        System.out.println("通知短信状态报告");
    }

    @Override
    public void uplink() {

    }
}
