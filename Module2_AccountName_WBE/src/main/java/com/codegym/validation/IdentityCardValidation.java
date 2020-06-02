package com.codegym.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentityCardValidation implements ConstraintValidator<IdentityCard, String> {
   @Override
   public void initialize(IdentityCard constraint) {
   }

   @Override
   public boolean isValid(String IdNumberField, ConstraintValidatorContext context) {
      return IdNumberField!=null && (IdNumberField.matches(FIRST_ID_NUMBER_PATTERN)
              || IdNumberField.matches(SECOND_ID_NUMBER_PATTERN));
   }
   static final String FIRST_ID_NUMBER_PATTERN = "^([0-9]{9})$";
   static final String SECOND_ID_NUMBER_PATTERN = "^([0-9]{12})$";
}
