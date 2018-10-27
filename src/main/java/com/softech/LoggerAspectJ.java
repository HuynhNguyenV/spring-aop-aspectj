package com.softech;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggerAspectJ {


    @Before("execution(* com.softech.Hello.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.softech.Hello.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("after method: " + joinPoint.getSignature().getName());
    }

    // chỉ thực hiện log với method2 của Hello.java
    @AfterReturning(pointcut = "execution(* com.softech.Hello.method2(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("after run method: " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
    }


    @AfterThrowing(pointcut = "execution(* com.softech.Hello.*(..))", throwing = "error")
    public void logThrow(JoinPoint joinPoint, Throwable error){
        System.out.println("exception in method: " + joinPoint.getSignature().getName());
        System.out.println("Exception is : " + error);
    }

}
