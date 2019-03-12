package com.dhc.pattern.singleton.create;

/**
 * 饿汉式
 * 优点:
 * 1.逻辑简单
 * 缺点:
 * 1.加载时进行初始化，如后续不使用则浪费空间
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
