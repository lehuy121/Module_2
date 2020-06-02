package com.codegym.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidation implements ConstraintValidator<Email, String> {
   public void initialize(Email constraint) {
   }

   public boolean isValid(String EmailField, ConstraintValidatorContext context) {

      return EmailField.matches(EMAIL_PATTERN);
   }
   static final String EMAIL_PATTERN = "^[a-z][a-z0-9_\\.]{5,32}@[a-z]{2,}(\\.[a-z]{2,4}){1}$";
}
