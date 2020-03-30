package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {


    @Test
    public void testCase1(){
        System.out.println("这是测试用例1啊");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod在每一个测试用例之前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod在每一个测试用例之后执行");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass会在类运行之前执行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass会在类运行之后执行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是一个测试套件，可以包含很多个类");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("这是一个测试套件，在套件内类都运行完成之后运行");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest会在class的前运行");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest执行了");
    }
    @BeforeGroups//你怎么没有执行呢？----没有告诉ta是哪个组，就是组名
    public void beforeGroups(){
        System.out.println("BeforeGroups会在who的前还是后？");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("AfterGroups执行了");
    }
}
