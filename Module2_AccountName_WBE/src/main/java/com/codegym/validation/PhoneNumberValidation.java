package com.codegym.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidation implements ConstraintValidator<PhoneNumber, String> {
   @Override
   public void initialize(PhoneNumber constraint) {
   }
   static final String FIRST_PATTERN = "(09[0|1])+([0-9]{7})\\b";
   static final String SECOND_PATTERN = "([(](84)[)]\\+)+(9[0|1])+([0-9]{7})\\b";
   @Override
   public boolean isValid(String phoneNumberField, ConstraintValidatorContext context) {

      return phoneNumberField!=null && (phoneNumberField.matches(FIRST_PATTERN)
              || phoneNumberField.matches(SECOND_PATTERN));
   }
}
