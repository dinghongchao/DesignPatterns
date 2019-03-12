package com.dhc.pattern.singleton;

import com.dhc.pattern.singleton.create.LazySingleton;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class SingletonTest {

   private static ExecutorService executor = new ThreadPoolExecutor(5, 5, 0, TimeUnit.MILLISECONDS,
           new LinkedBlockingQueue<>(10), new ThreadFactory() {
        final AtomicLong count = new AtomicLong(0);
       @Override
       public Thread newThread(Runnable r) {
           Thread t = Executors.defaultThreadFactory().newThread(r);
           t.setName(String.format("single-pool-%d",count.getAndIncrement()));
           return t;
       }
   }, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws InterruptedException {
        executor.submit(new Runnable() {
            @Override
            public void run() {
                LazySingleton singleton = LazySingleton.getInstance();
                System.out.println(singleton);
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                LazySingleton singleton = LazySingleton.getInstance();
                System.out.println(singleton);
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                LazySingleton.test();
            }
        });
        Thread.sleep(200);
        executor.shutdown();
    }
}
