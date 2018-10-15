package org.zstack.utils.form;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(java.lang.annotation.ElementType.FIELD)
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Param {
    boolean required() default true;

    boolean noTrim() default false;

    long[] numberRange() default {};

    Class resourceType() default Object.class;
}