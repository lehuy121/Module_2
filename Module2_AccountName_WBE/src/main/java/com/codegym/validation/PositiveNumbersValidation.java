package com.codegym.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PositiveNumbersValidation implements ConstraintValidator<PositiveNumbers, Integer> {
   @Override
   public void initialize(PositiveNumbers constraint) {
   }
   @Override
   public boolean isValid(Integer numberField, ConstraintValidatorContext context) {
      return numberField != null && numberField > 0;
   }
   static final String POSITIVE_NUMBER = "^([0-9])$";
}
