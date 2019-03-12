package com.dhc.pattern.singleton.create;

import java.io.Serializable;
import java.util.concurrent.Executors;

/**
 * 懒加载 懒汉式
 * 优点：
 * 1.调用时才加载具体类
 * 缺点：
 * 1.代码逻辑复杂要考虑并发问题
 * 2.加锁会降低性能
 */
public class LazySingleton implements Serializable {

    /**
     * 防止指令重排序
     */
    private static volatile LazySingleton instance;

    private LazySingleton(){}

    /**
     * double check
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            synchronized(LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }




    public static void test() {
        System.out.println("====================");
    }
}
