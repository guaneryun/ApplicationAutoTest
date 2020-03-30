package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsClassTest3 {
    public void teacher1(){
        System.out.println("test3的teacher11111111用例");
    }
    public void teacher2(){
        System.out.println("test3的teacher22222222用例");
    }
}
