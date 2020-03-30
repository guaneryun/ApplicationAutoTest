package com.course.testng.suite;

import org.testng.annotations.Test;

public class PayTest {
    @Test(enabled = false)
    public void payTest(){
        System.out.println("支付成功了");
    }
}
