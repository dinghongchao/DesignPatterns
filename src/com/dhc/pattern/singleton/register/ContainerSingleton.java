package com.dhc.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();


    private ContainerSingleton() {

    }

    public static Object getInstance(String className) {
        try {
            synchronized(ioc) {
                if(ioc.containsKey(className)) {
                    return ioc.get(className);
                } else {
                    Object obj = Class.forName(className);
                    ioc.put(className,obj);
                    return obj;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
