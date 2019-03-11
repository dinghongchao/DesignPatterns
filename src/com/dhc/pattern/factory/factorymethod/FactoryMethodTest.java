package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.ISms;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ISmsFactory factory = new NoticeSmsFactory();
        ISms sms =  factory.createSms();
        sms.send();
    }


}
