package lhf.test02.a1;

import org.junit.Test;

public class UnsafeSequence {
    private int value = 10;

    public synchronized int getNext(){
        return value++;
    }

    @Test
    public void test() throws InterruptedException {
        for (int i=10;i<1000;i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(getNext());
                }
            }).start();
        }
    }
}
