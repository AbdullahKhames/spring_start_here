package ssh.demos.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ssh.demos.repositories.Comment;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
@Order(2)
public class LoggingAspect {

//    @Around("execution(* ssh.demos.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Entering {}", joinPoint.getSignature().getName());
        log.info("Method will execute");
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();
        log.info("Method {} with parameters {} will execute", methodName, Arrays.asList(arguments));
        Object val =  joinPoint.proceed();
        log.info("Method executed and returned {}", val);
        return val;
    }
//    @Around("execution(* ssh.demos.services.*.*(..))")
//    public Object alteringLog(ProceedingJoinPoint joinPoint) throws Throwable {
//        log.info("Entering {}", joinPoint.getSignature().getName());
//        log.info("Method will execute");
//        String methodName = joinPoint.getSignature().getName();
//        Object [] arguments = joinPoint.getArgs();
//        Comment comment = new Comment();
//        comment.setText("other comment");
//        Object [] newArguments = new Object[]{comment};
//        log.info("Method {} with parameters {} will execute", methodName, Arrays.asList(arguments));
//        Object val =  joinPoint.proceed(newArguments);
//        log.info("Method executed and returned {}", val);
//        return "Failed";
//    }

    @Around("@annotation(ToLog)")
    public Object interceptMethodsWithSpecificAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        return log(joinPoint);
    }
}
