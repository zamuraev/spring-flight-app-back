package com.zamuraev.validation;

import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({TYPE,FIELD,ANNOTATION_TYPE})
public @interface PasswordMatches {

    String message() default "Password must match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
