package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "server")
    public void testCase1() {
        System.out.println("服务端测试1111");
    }
    @Test(groups = "server")
    public void testCase2() {
        System.out.println("服务端测试2222");
    }
    @Test(groups = "client")
    public void testCase3() {
        System.out.println("客户端测试3333");
    }
    @Test(groups = "client")
    public void testCase4() {
        System.out.println("客户端测试4444");
    }
    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("服务端用例执行之前运行");
    }
    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("服务端用例执行之后运行");
    }
}
