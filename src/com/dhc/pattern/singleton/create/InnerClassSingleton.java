package com.dhc.pattern.singleton.create;

/**
 * 静态内部类
 * 优点：
 * 1.延迟加载，逻辑简单
 * 缺点：
 * 1.
 */
public class InnerClassSingleton {

    static{
        System.out.println("load outer class");
    }
    private InnerClassSingleton (){}

    public static InnerClassSingleton getInstance() {
        return Holder.INSTANCE;
    }


    private static class Holder {

        static{
            System.out.println("load inner class");
        }

        public static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
