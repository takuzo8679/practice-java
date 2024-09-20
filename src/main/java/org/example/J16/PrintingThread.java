package org.example.J16;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class PrintingThread extends Thread{
//public class PrintingThread implements Runnable{
    final AtomicBoolean stopReq = new AtomicBoolean(false);

    public void run() {
        for (int i=9; i >=0; i--) {
            System.out.print(i+"..");
            if (stopReq.get()) break;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
