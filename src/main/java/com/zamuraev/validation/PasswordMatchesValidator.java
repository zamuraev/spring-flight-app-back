package com.zamuraev.validation;

import com.zamuraev.dto.AccountDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        AccountDto accountDto = (AccountDto) value;
        return accountDto.getPassword().equals(accountDto.getConfpassword());
    }
}
