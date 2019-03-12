package com.dhc.pattern.singleton.destroy;

import com.dhc.pattern.singleton.create.InnerClassSingleton;
import com.dhc.pattern.singleton.create.LazySingleton;
import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class ReflectDestroySingleton {

    private static final ExecutorService executorService = new ThreadPoolExecutor(5, 5, 0, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(10), new ThreadFactory() {
        final AtomicLong count = new AtomicLong(0);
        @Override
        public Thread newThread(Runnable r) {
            Thread t = Executors.defaultThreadFactory().newThread(r);
            t.setName(String.format("single-pool-%d",count.getAndIncrement()));
            return t;
        }
    },new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws InterruptedException {

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                destroy(args);
                destroyInner(args);
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                destroy(args);
                destroyInner(args);
            }
        });

        Thread.sleep(100);

        executorService.shutdown();
    }


    private static void destroy(String[] args) {
        try {
            Class<LazySingleton> clazz = LazySingleton.class;
            // Constructor<LazySingleton> constructor = clazz.getConstructor(); 只返回public构造
            Constructor<LazySingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazySingleton singleton = constructor.newInstance();
            //Method method = clazz.getDeclaredMethod("getInstance",null);
            //LazySingleton singleton = (LazySingleton) method.invoke(clazz,args);
            System.out.println(singleton);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void destroyInner(String[] args) {
        try {
            Class<InnerClassSingleton> clazz = InnerClassSingleton.class;
            // Constructor<LazySingleton> constructor = clazz.getConstructor(); 只返回public构造
            Constructor<InnerClassSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            InnerClassSingleton singleton = constructor.newInstance();
            //Method method = clazz.getDeclaredMethod("getInstance",null);
            //LazySingleton singleton = (LazySingleton) method.invoke(clazz,args);
            System.out.println(singleton);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
