package pl.sdacademy.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
        public static void main(String[] args) {
                ExecutorService executorService = Executors.newFixedThreadPool(4);
                executorService.submit(() -> System.out.println("hello"));
                executorService.submit(() -> System.out.println("hello"));
                executorService.submit(() -> System.out.println("hello"));
                executorService.submit(() -> System.out.println("hello"));
                executorService.shutdown();
                executorService.submit(() -> System.out.println("hello"));
        }
}
