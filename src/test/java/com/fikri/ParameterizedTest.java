package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ParameterizedTest {

    @Test
    void testParameterReturn() throws NoSuchMethodException {

        Class<Person> personClass = Person.class;

        Method getHobbies = personClass.getDeclaredMethod("getHobbies");

        Type returnType = getHobbies.getGenericReturnType();
        if (returnType instanceof ParameterizedType) {

            ParameterizedType parameterizedType = (ParameterizedType) returnType;
            System.out.println(parameterizedType.getRawType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }
    }


    @Test
    void testParameter() throws NoSuchMethodException {

        Class<Person> personClass = Person.class;

        Method setHobbies = personClass.getDeclaredMethod("setHobbies", List.class);

        for (Type type : setHobbies.getGenericParameterTypes()) {

            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                System.out.println(parameterizedType.getRawType());
                System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
            }

        }
    }


    @Test
    void paramFieldTest() throws NoSuchFieldException {

        Class<Person> personClass = Person.class;

        Field hobbies = personClass.getDeclaredField("hobbies");

        Type type = hobbies.getGenericType();
        if (type instanceof ParameterizedType) {

            ParameterizedType parameterizedType = (ParameterizedType) type;
            System.out.println(parameterizedType.getRawType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }

    }
}
