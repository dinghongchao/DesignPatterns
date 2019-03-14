package com.dhc.pattern.singleton.threadlocal;

public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }


}
