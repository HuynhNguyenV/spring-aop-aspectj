package com.softech;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class DemoBeforeAdvice implements MethodBeforeAdvice {


    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before Advice: " + method.getName());
    }
}
