package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 陈 on 2017/9/6.
 */
public class LogAOP {

    Logger logger = Logger.getLogger(LogAOP.class);
    //记录的日志内容
    String strLog=null;
    //前置通知
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("获取前置通知");
        strLog="[执行：]log Begining method:"
                //获取执行的类名
                +joinPoint.getClass().getName()+"."
                //获取执行的方法名
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //后置通知
    public void somethingAfter(JoinPoint joinPoint){
        System.out.println("进入后置通知");
        strLog="[执行：]log Begining method:"
                //获取执行的类名
                +joinPoint.getClass().getName()+"."
                //获取执行的方法名
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    /*环绕通知:
    包围一个连接点的通知，可以在方法的调用前后自定义行为，也可以选择不执行类似web
    中Servlet规范中的Filter的doFilter方法*/
    public Object somethingAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object retVal=proceedingJoinPoint.proceed();//执行此方法
        long end=System.currentTimeMillis();
        System.out.println("该方法执行了："+(end-start)+"ms");
        logger.info("该方法执行了："+(end-start)+"ms");
        return retVal;
    }
}
