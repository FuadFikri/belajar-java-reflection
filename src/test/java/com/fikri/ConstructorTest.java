package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ConstructorTest {


    @Test
    void getConstructor() {

        Class<Person> personClass = Person.class;

        for (Constructor<?> constructor : personClass.getDeclaredConstructors()) {

            System.out.println(constructor.getName());
            System.out.println(constructor.getModifiers());
            System.out.println(Arrays.toString(constructor.getParameterTypes()));

            System.out.println("==========");
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(parameter.getName() + " " + parameter.getType());
            }

        }
    }

    @Test
    void createObject() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Constructor<Person> constructorEmpty = personClass.getConstructor();
        Constructor<Person> constructorParam = personClass.getConstructor(String.class, String.class, String.class, String.class );

        Person person = constructorEmpty.newInstance();
        Person person2 = constructorParam.newInstance("fikri", "Fuad", "tes","123");

        System.out.println(person);
        System.out.println(person2);
    }
}
