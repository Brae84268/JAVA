package idusw.springboot.kdhmall.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* idusw.springboot.kdhmall.service.*ServiceImpl.loginById*(..))")
    public  void getLogging() {}

    @Before("getLogging()")
    public void loggerBefore(JoinPoint joinPoint) {

        for(int i = 1; i < 10; i++)
            System.out.println("횡단관심, 공통코드 : 보안, 트랜잭션, 로깅 ..");
//        String message = "AOP - 로깅 시작";
//        logger.info(message);
    }

    @AfterReturning("execution(* idusw.springboot.kdhmall.service.MemberServiceImpl.*(..))")
    public void loggerAfterReturning(JoinPoint joinPoint) {
        String message = "트랜잭션 처리";
        logger.info(message);
    }
}