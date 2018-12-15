package pl.sdacademy.thread;

public class EventExample {
        public static void main(String[] args) {
                runInThread(()-> {
                        System.out.println("Calculating the result...");
                        try {
                                Thread.sleep(2000);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                });
        }
        private static void runInThread(Runnable runnable) {
                runnable.run();
        }
}

