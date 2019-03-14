package com.dhc.pattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.Method;

public class JdkProxyTest {

    public static void main(String[] args) {
       Object obj = new JdkMeiPo().getInstance(new Girl());

        try {
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
