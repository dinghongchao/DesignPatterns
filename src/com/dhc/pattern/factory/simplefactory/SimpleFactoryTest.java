package com.dhc.pattern.factory.simplefactory;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.VerificationCodeSms;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        testByCase("notice");
        testByClassName("com.dhc.pattern.factory.MarketSms");
        testByClazz(VerificationCodeSms.class);
    }

    private static void testByCase(String condition) {
        SimpleFactoryByCase simpleFactoryByCase = new SimpleFactoryByCase();
        ISms sms = simpleFactoryByCase.createSms(condition);
        sms.send();
    }

    private static void testByClassName(String className) {
        SimpleFactoryByCase simpleFactoryByCase = new SimpleFactoryByCase();
        ISms sms = simpleFactoryByCase.createSmsByClassName(className);
        sms.send();
    }

    private static void testByClazz (Class<?> clazz) {
        SimpleFactoryByCase simpleFactoryByCase = new SimpleFactoryByCase();
        ISms sms = simpleFactoryByCase.createSmsByClazz(clazz);
        sms.send();
    }
}
