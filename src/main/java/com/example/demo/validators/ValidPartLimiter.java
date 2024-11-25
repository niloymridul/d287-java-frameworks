package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {PartLimiterValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartLimiter {
    String message() default "Error: Inventory value is incorrect.";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
