package com.example.demo.thread;


import java.util.concurrent.*;

public class hackQueue {



    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>() {
            private static final long serialVersionUID = -6903933921423432194L;
            @Override
            public boolean offer(Runnable e) {
                //如果已经有0个项目排队，则将其提供给队列
                //否则返回false，因此TPE将添加另一个线程。 如果返回假
                //并且已达到最大线程数，然后RejectedExecutionHandler将被调用，它将放入队列。
                if (size() == 0) {
                    return super.offer(e);
                } else {
                    return false;
                }
            }
        };
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1 /*core*/, 50 /*max*/,
                60 /*secs*/, TimeUnit.SECONDS, queue,Executors.defaultThreadFactory());
        threadPool.setRejectedExecutionHandler((r, executor) -> {
            try {
                //  这确实将实际放入队列中。 一旦达到最大线程数，任务将排队。
                executor.getQueue().put(r);
                // 我们在put（）之后执行此操作以停止竞争条件
                if (executor.isShutdown()) {
                    throw new RejectedExecutionException(
                            "Task " + r + " rejected from " + executor);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }

}
