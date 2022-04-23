package com.basicExersice.concurrent;

public class ThreadLocalDemo {

    static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(threadLocal.get());
            threadLocal.set(0);
            threadLocal.set(55);
            System.out.println(threadLocal.get());

        });

        Thread t2 = new Thread(() ->{
            System.out.println(threadLocal.get());
            threadLocal.set(1);
            System.out.println(threadLocal.get());
        });
        t1.start();
        t1.join();
        t2.start();

    }
}
