package com.codegym.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CanNotNullValidation implements ConstraintValidator<CanNotNull, String> {
   @Override
   public void initialize(CanNotNull constraint) {
   }
   @Override
   public boolean isValid(String obj, ConstraintValidatorContext context) {
      return obj != null;
   }
}
