package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.NoticeSms;

public class NoticeSmsFactory implements ISmsFactory {

    @Override
    public void send() {
        NoticeSms noticeSms = new NoticeSms();
        noticeSms.send();
    }
}
