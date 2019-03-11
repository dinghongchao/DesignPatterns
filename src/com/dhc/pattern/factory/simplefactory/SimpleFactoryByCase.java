package com.dhc.pattern.factory.simplefactory;

import com.dhc.pattern.factory.ISms;
import com.dhc.pattern.factory.MarketSms;
import com.dhc.pattern.factory.NoticeSms;
import com.dhc.pattern.factory.VerificationCodeSms;

/**
 * 小作坊
 */
public class SimpleFactoryByCase {

    public ISms createSms(String condition) {
        if ("verification".equals(condition)) {
            return new VerificationCodeSms();
        }
        if ("notice".equals(condition)) {
            return new NoticeSms();
        }
        if ("market".equals(condition)) {
            return new MarketSms();
        }
        System.out.println("未找到匹配项");
        return null;
    }

    public ISms createSmsByClassName(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return (ISms) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ISms createSmsByClazz (Class clazz) {
        try {
            return (ISms) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
