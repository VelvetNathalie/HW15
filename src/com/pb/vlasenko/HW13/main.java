package com.pb.vlasenko.HW13;

import java.io.Writer;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class main {
    public static void main(String[] args) throws Exception {
        LinkedList<Double> sharedQueue = new LinkedList<>();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue), "Consumer");
        prodThread.start();
        consThread.start();

        Thread.sleep(100);

        prodThread.interrupt();
        consThread.interrupt();
    }
}

