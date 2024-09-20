package org.example.J16;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;

public class Exe {
    public static void execute() {
        threadSafe();
    }
    private static void threadSafe(){

    }
    private static void catchUpCount() {
        ThreadFactory factory = Thread.ofVirtual().factory();
        Runnable print50 = ()->{
            for(int i = 0; i <= 50; i++) {
                System.out.print(i+",");
            }
            System.out.print("\n");
        };
        Thread t1 = factory.newThread(print50);
        Thread t2 = factory.newThread(print50);
        Thread t3 = factory.newThread(print50);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        System.out.println("end");
    }

    private static void printingThread() {
        System.out.println("Start");
//        Thread t = new PrintingThread();
//        Thread t = new Thread(new PrintingThread());
//        NG(can not resolve ofVirtual)Thread t = Thread.Builder.ofVirtual().unstarted(new PrintingThread());
//        Thread t = Thread.ofVirtual().unstarted(new PrintingThread());
        PrintingThread t = new PrintingThread();
        t.start();
        String input = new Scanner(System.in).nextLine();
        if (input.equals("stop")) {
            t.stopReq.set(true);
        }
//        t.interrupt();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
            }
        System.out.println("end");
    }
}
