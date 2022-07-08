package com.avbravo.jmoordb.core.annotation ;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
*
* @author avbravo
*/


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface DatePattern {

    String dateformat() default ("dd/MM/yyyy HH:mm:ss a");


}
