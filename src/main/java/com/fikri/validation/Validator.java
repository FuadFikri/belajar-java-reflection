package com.fikri.validation;

import com.fikri.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {


    public static void validateNotBlank(Object obj) throws IllegalAccessException {

        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();


        for (Field field : fields) {

            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            if (notBlank != null) {
                field.setAccessible(true);
                String value = (String) field.get(obj);

                if (!notBlank.allowEmptyString()) value = value.trim();

                if ("".equalsIgnoreCase(value) || null == value) {
                    throw new RuntimeException(field.getName() + " cannot be blank");
                }
            }

        }
    }
}
