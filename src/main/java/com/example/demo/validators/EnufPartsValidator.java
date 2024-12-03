package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidEnufParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        if(context!=null)myContext=context;
        ProductService repo = myContext.getBean(ProductServiceImpl.class);
        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());
            System.out.println(myProduct.getParts().size());
            for (Part p : myProduct.getParts()) {
                if (p.getMinInv() > (p.getInv() - (product.getInv()-myProduct.getInv()))){   //Work on this line
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate("This cannot be sanctioned as the input is smaller than the minimum allowed amount of units required.");
                    return false;
                }
                    if(p.getInv()>(p.getMaxInv())){
                        constraintValidatorContext.disableDefaultConstraintViolation();
                        constraintValidatorContext.buildConstraintViolationWithTemplate("This cannot be sanctioned as the input is greater than the maximum allowed amount of units required.");
                        return false;
                    }
            }
            return true;
        }
        else{
                return false;
            }
        }
    }

