package pl.sdacademy.ownannotation;

@FirstAnnotation(length = 0)
public class TestClass {
        @FirstAnnotation(value = "TE-st", length = 5)
        int test;

        @BenchamrkTime
        void test1() throws InterruptedException {
                Thread.sleep(1500);
        }

        @BenchamrkTime
        void test2() throws InterruptedException {
                Thread.sleep(2000);
        }

        void test3() throws InterruptedException {
                Thread.sleep(500);
        }
}
