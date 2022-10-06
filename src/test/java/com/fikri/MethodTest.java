package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class MethodTest {


    @Test
    void methodTest() {

        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println("==========");
        }



    }

    @Test
    void callMethod() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person1 = new Person("fikri","fuad","fik@mail.com","0123");

        Class<Person> personClass = Person.class;

        Method getFirstName = personClass.getDeclaredMethod("getFirstName");

        Object firstNameValue = getFirstName.invoke(person1);
        System.out.println(firstNameValue);
    }

    @Test
    void parameterTest() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person1 = new Person("fikri","fuad","fik@mail.com","0123");

        Class<Person> personClass = Person.class;

        for (Method method : personClass.getDeclaredMethods()) {
            Parameter[] params = method.getParameters();
            System.out.println("method " + method.getName());
            for (Parameter param : params) {
                System.out.println(param.getName() + " " + param.getType());
            }
            System.out.println("=========");
        }


    }

    @Test
    void callMethodWithParam() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person1 = new Person("fikri","fuad","fik@mail.com","0123");

        Class<Person> personClass = Person.class;

        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        setFirstName.invoke(person1, "Is");
        System.out.println(person1);
    }
}
