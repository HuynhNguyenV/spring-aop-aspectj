package com.softech;

import org.springframework.aop.ThrowsAdvice;

public class DemoThrowAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Exception{
        System.out.println("Throw Advice method: ");
    }
}
