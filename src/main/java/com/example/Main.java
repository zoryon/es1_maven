package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 200;
        MyThread t1 = new MyThread(l);
        MyThread t2 = new MyThread(l);

        new Thread(t1).start();;
        new Thread(t2).start();;
    }
}