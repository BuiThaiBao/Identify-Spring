package com.bao.identity_service.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE }) // Sử dụng ở đâu
@Retention(RUNTIME) // Xử lý lúc nào
@Constraint(validatedBy = {DobValidator.class}) // Class chịu trách nhiệm validate
public @interface DobConstraint {
    String message() default "{Invalid date of birth}";

    int min();



    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
