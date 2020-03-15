//package com.company.thread;
//
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.IntStream;
//
//public class threadPool {
//
//
//    public static int right() throws InterruptedException {
//        //使用一个计数器跟踪完成的任务数
//        AtomicInteger atomicInteger = new AtomicInteger();
//        //创建一个具有2个核心线程、5个最大线程，使用容量为10的ArrayBlockingQueue阻塞队列作为工作队列的线程池，使用默认的AbortPolicy拒绝策略
//        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
//                2, 5,
//                5, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(10),
//                Executors.defaultThreadFactory());
//
//        System.out.println(threadPool);
//        //每隔1秒提交一次，一共提交20次任务
//        IntStream.rangeClosed(1, 20).forEach(i -> {
//            try {
//                TimeUnit.MILLISECONDS.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            int id = atomicInteger.incrementAndGet();
//            try {
//                threadPool.submit(() -> {
//                    //每个任务耗时10秒
//                    try {
//                        TimeUnit.SECONDS.sleep(5);
//                    } catch (InterruptedException e) {
//                    }
//                });
//            } catch (Exception ex) {
//                //提交出现异常的话，打印出错信息并为计数器减一
//                ex.printStackTrace();
//                atomicInteger.decrementAndGet();
//            }
//        });
//
//        TimeUnit.SECONDS.sleep(1);
//        return atomicInteger.intValue();
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println(right());
//    }
//}
