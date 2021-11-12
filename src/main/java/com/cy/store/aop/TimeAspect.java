package com.cy.store.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component //将当前类的对象创建使用维护交由Spring容器维护
@Aspect //将当前类标记为切面
public class TimeAspect {
    @Around("execution(* com.cy.store.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //先记录当前时间
        long start = System.currentTimeMillis();
        Object result = pjp.proceed(); //调用目标方法：login
        //插入数据库
        //TODO
        //后记录当前时间
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
        return result;
    }
}
