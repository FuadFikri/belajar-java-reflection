package com.fikri;


import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ClassTest {

    @Test
    void createClassTest() throws ClassNotFoundException {

        Class<Person> personClass1 = Person.class;

        Class<?> person2 = Class.forName("com.fikri.data.Person");

        Person person = new Person();
        Class<? extends Person> person3 = person.getClass();

        System.out.println(personClass1.getName());
    }


    @Test
    void classMEthodTest() {

        Class<Person> personClass = Person.class;

        System.out.println(personClass.getName()); // com.fikri.data.Person
        System.out.println(personClass.getSimpleName()); //Person
        System.out.println(personClass.getTypeName()); // com.fikri.data.Person
        System.out.println(personClass.getCanonicalName()); //com.fikri.data.Person
        System.out.println(personClass.getPackage()); //package com.fikri.data
        System.out.println(personClass.getSuperclass()); //class java.lang.Object
        System.out.println(Arrays.toString(personClass.getInterfaces())); // []
        System.out.println(Arrays.toString(personClass.getDeclaredConstructors())); //[public com.fikri.data.Person(), public com.fikri.data.Person(java.lang.String,java.lang.String)]
        System.out.println(Arrays.toString(personClass.getDeclaredMethods())); //[public java.lang.String com.fikri.data.Person.toString(), public void com.fikri.data.Person.setLastName(java.lang.String), public void com.fikri.data.Person.setFirstName(java.lang.String), public java.lang.String com.fikri.data.Person.getLastName(), public java.lang.String com.fikri.data.Person.getFirstName()]

    }
}
