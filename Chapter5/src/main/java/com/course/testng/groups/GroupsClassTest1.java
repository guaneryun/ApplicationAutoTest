package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsClassTest1 {

    public void student1(){
        System.out.println("test1的student11111111用例");
    }
    public void student2(){
        System.out.println("test1的student22222222用例");
    }
}
