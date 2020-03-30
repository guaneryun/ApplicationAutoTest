package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /*

    异常测试适用场景：接口传入异常数据，预期将出现的结果
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionFailed(){
        System.out.println("这个异常测试用例会运行失败的！");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionSuccess(){
        System.out.println("这个异常测试用例会执行成功的哦~");
        throw new RuntimeException();
    }
}
