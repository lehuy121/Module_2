package com.codegym.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PositiveNumbersValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PositiveNumbers {
    String message() default "Invalid number format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}