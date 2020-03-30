package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadTest {

    @Test(invocationCount = 5,threadPoolSize = 5)
    public void threadTest(){
        System.out.println("这是我要说的话");
        System.out.printf("ThreadId:%s%n",Thread.currentThread().getId());
    }
}
