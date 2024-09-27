package ssh.demos.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
@Order(1)
public class SecurityAspect {

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Security Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        log.info("Security Aspect: Method executed and returned {}", returnedValue);
        return returnedValue;
    }
}