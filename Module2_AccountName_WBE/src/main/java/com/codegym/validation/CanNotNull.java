package com.codegym.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CanNotNullValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CanNotNull {
    String message() default "Field can not null";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

