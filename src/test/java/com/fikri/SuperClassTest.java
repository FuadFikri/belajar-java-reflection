package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

public class SuperClassTest {


    @Test
    void getSuperClass() {

        Class<Person> personClass = Person.class;
        System.out.println(personClass); //class com.fikri.data.Person

        Class<? super Person> superClass = personClass.getSuperclass();
        System.out.println(superClass); //class java.lang.Object

        Class<? super Person> superClassTop = superClass.getSuperclass();
        System.out.println(superClassTop); //null
    }
}
