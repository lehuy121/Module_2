package com.codegym.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IdentityCardValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IdentityCard {
    String message() default "Invalid id number. Must be a sequence of 9 or 12 numbers ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
