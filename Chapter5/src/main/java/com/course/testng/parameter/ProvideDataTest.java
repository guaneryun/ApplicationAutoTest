package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ProvideDataTest {

    @Test(dataProvider = "data")
    public void provideTest(String name,int age){
        System.out.println("name:"+name+";   age:"+age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvide(){
        Object[][] objects=new Object[][]{
                {"zhangsan",15},
                {"lisi",23}
        };
        return objects;
    }
    @Test(dataProvider = "method")
    public void dataTest1(String name,int age){
        System.out.println("name:"+name+";   age:"+age);
    }
    @Test(dataProvider = "method")
    public void dataTest2(String name,int age){
        System.out.println("name:"+name+";   age:"+age);
    }
    @DataProvider(name = "method")
    public Object[][] dataProviderOnMethod(Method method){
        Object[][] object= null;
        if(method.getName().equals("dataTest1")){
            object=new Object[][]{
                {"方法1的名字1",24},
                {"方法1的名字2",34}
            };
        }else if (method.getName().equals("dataTest2")){
            object =new Object[][]{
                {"方法2的名字1",24},
                {"方法2的名字2",34}
            };
        }
        return object;
    }
}
