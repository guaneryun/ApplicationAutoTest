package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestSuite {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
    @BeforeTest
    public void beforeTest(){

        System.out.println("BeforeTest会在class的前运行");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest执行了");
    }
}
