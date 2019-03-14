package com.dhc.pattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeiPo implements InvocationHandler {


    private Object target;

    public Object getInstance(Object person){
        this.target = person;

        Class clazz = person.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("双方见面");
    }

    private void before() {
        System.out.println("确认需求开始寻找");
    }
}
