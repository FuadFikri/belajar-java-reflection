package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTest {


    @Test
    void getPrimitive() {

        Class<Integer> integerClass = int.class;
        Class<Long> longClass = long.class;
        Class<Boolean> booleanClass = boolean.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());
    }


    @Test
    void getData() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field field = personClass.getDeclaredField("age");
        field.setAccessible(true);

        Person person = new Person("fikri","i","fi@mail.com","123");
        person.setAge(20);

        System.out.println(field.getInt(person));
    }

    @Test
    void getMethod() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<Person> personClass = Person.class;
        Method method = personClass.getDeclaredMethod("setAge", int.class);

        Person person = new Person("fikri","i","fi@mail.com","123");
        method.invoke(person, 20);

        System.out.println(person.getAge());
    }
}
