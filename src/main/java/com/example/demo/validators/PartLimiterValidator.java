package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartLimiterValidator implements ConstraintValidator<ValidPartLimiter, Part> {

    @Override
    public void initialize(ValidPartLimiter constraintAnnotation) {
   //     ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext context) {
        if (part.getInv() < part.getMinInv()) {
       //     ConstraintValidatorContext constraintValidatorContext = null;
      //      constraintValidatorContext.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Error:Inventory is less than minimum required.");
            return false;
        }
        if(part.getInv() > part.getMaxInv()) {
      //      ConstraintValidatorContext constraintValidatorContext = null;
       //     constraintValidatorContext.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Error:Inventory is greater than maximum required.");
            return false;
        }
        return true;
    }
}
