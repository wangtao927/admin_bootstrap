package com.sunshine.tiantong.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 监控
 * @author wangt
 */
public class MonitorInterceptor {

    private static Logger logger = LoggerFactory.getLogger(MonitorInterceptor.class);

    /**上报埋点数据*/
    private static ExecutorService uploadThreadPool = Executors.newFixedThreadPool(4);

    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        Long startTime = System.currentTimeMillis();
        Object result = null;

        Object[] o = joinPoint.getArgs();
        String className = joinPoint.getTarget().getClass().getSimpleName();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();


        logger.info("method :[{}] cost:[{}] vo:[{}] result:[{}]", className + "." + method.getName(),
            (System.currentTimeMillis()-startTime), o, result);

        return result;

    }

}
