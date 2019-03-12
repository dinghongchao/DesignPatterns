package com.dhc.pattern.singleton.create;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InnerClassOrderTest {

    public static void main (String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = InnerClassSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        InnerClassSingleton s = (InnerClassSingleton) constructor.newInstance();
        System.out.println("=======================");
        // 可得出内部类只有在第一次使用时才加载
        //https://zhuanlan.zhihu.com/p/40786008
        InnerClassSingleton.getInstance();
    }
}
