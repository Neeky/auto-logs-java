package com.example.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.example.demo.controllers.*.*(..))")
    public void logPoint() {}

    @Before(value = "logPoint()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getDeclaringTypeName() + "." +jp.getSignature().getName();
        log.info(name + " 开始执行");
    }

    @After(value="logPoint()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getDeclaringTypeName() + "." +jp.getSignature().getName();
        log.info(name + " 执行完成");
    }
}
