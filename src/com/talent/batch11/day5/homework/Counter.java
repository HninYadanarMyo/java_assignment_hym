package com.talent.batch11.day5.homework;

public class Counter {
    public int instanceCount = 0;
    public static int globalCount = 0;

    public Counter() {
        instanceCount++;
        globalCount++;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Instance count for C1: "+c1.instanceCount);
        System.out.println("Instance count for C2: "+c2.instanceCount);
        System.out.println("Instance count for C3: "+c3.instanceCount);
        System.out.println("Global Count: "+Counter.globalCount);
    }
}
