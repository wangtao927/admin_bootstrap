package com.sunshine.tiantong.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by zhuq on 2016/6/3.
 */
public class ExceptionInterceptor {

    protected static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

//    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        Class<?> type = method.getReturnType();
//
//       Throwable throwedException;
//
////        try {
////            return joinPoint.proceed();
////        } catch (Exception e) {
////            throwedException = e;
////            errorCode = BusinessCodeEnum.PARAMS_ERROR.getErrorCode();
////            errorMessage = BusinessCodeEnum.PARAMS_ERROR.getErrorMessage() + ":" + ValidationUtils.getConstraintViolationMsg(e);
////            logger.error("ExceptionInterceptor ConstraintViolationException, errorMsg ‘{}’", errorMessage);
////        } catch (RpcException e) {
////            throwedException = e;
////            Throwable cause = e.getCause();
////            if (cause != null && ConstraintViolationException.class.isAssignableFrom(cause.getClass())) {
////                ConstraintViolationException ve = (ConstraintViolationException) cause;
////                errorCode = BusinessCodeEnum.PARAMS_ERROR.getErrorCode();
////                errorMessage = BusinessCodeEnum.PARAMS_ERROR.getErrorMessage() + ":" + ValidationUtils.getConstraintViolationMsg(ve);
////                logger.error("ExceptionInterceptor ConstraintViolationException, errorMsg ‘{}’", errorMessage);
////            }
////
////        } catch (Throwable t) {
////            throwedException = t;
////            errorCode = BusinessCodeEnum.SYSTEM_ERROR.getErrorCode();
////            errorMessage = BusinessCodeEnum.SYSTEM_ERROR.getErrorMessage();
////        }
////
////        logger.error("ExceptionInterceptor Exception:", throwedException);
////        if (ModelResult.class.isAssignableFrom(type)) {
////            return new ModelResult<>(errorCode,errorMessage);
////        }
////
////        if (BaseResult.class.isAssignableFrom(type)) {
////            return new BaseResult(errorCode,errorMessage);
////        }
////
////        throw  Throwables.propagate(throwedException);
//
//    }


}
