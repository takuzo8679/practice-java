package org.example.J16;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {
    private AtomicLong count = new AtomicLong(0);
    public void add(long i) {
        System.out.println("add");
        this.count.addAndGet(i);
    }
    public void mul(long i) {
        System.out.println("multiple");
        this.count.getAndUpdate(c -> c * i);
    }
//.   Before Thread safe
//    private long count = 0;
//    public void add(long i) {
//        System.out.println("add");
//        this.count += i;
//    }
//    public void mul(long i) {
//        System.out.println("multipule");
//        this.count *= i;
//    }
}
