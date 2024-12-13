package com.example.exercice_exception02.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.exercice_exception02.service.*.*(..)))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.printf("Entrer méthode : "+joinPoint.getSignature().getName());
        System.out.printf("Arguments : "+ Arrays.toString(joinPoint.getArgs()));
    }


}
