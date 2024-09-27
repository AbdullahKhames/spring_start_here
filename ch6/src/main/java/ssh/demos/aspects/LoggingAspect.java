package ssh.demos.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Around("execution(* ssh.demos.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Entering {}", joinPoint.getSignature().getName());
        log.info("Method will execute");
        var val =  joinPoint.proceed();
        log.info("Method executed");
        return val;
    }
}
