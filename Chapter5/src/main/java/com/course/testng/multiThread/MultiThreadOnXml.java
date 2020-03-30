package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void threadTest1(){
        System.out.println("这是我要说的话");
        System.out.printf("ThreadId:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void threadTest2(){
        System.out.println("这是我要说的话");
        System.out.printf("ThreadId:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void threadTest3(){
        System.out.println("这是我要说的话");
        System.out.printf("ThreadId:%s%n",Thread.currentThread().getId());
    }
}
