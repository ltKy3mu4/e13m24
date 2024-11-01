package ru.mpei.l12;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Bean {

    String name() default "";

//    int count() default 1;

}
