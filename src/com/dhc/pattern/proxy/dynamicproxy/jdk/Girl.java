package com.dhc.pattern.proxy.dynamicproxy.jdk;

import com.dhc.pattern.proxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高一米八");
    }
}
