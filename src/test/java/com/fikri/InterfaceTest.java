package com.fikri;

import com.fikri.data.Nameable;
import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

public class InterfaceTest {


    /*
    Interface tetap menggunakan class<?>
    yg membedakan dengan class adalah dengan method isInterface()
     */
    @Test
    void interfaceTest() {

        Class<Nameable> nameableClass = Nameable.class;

        System.out.println(nameableClass.getName());
        System.out.println(nameableClass.getSuperclass());
        System.out.println(nameableClass.isInterface());
    }


    @Test
    void superInterfaceTest() {
        Class<Person> personClass = Person.class;

        for (Class<?> anInterface : personClass.getInterfaces()) {
            System.out.println(anInterface.getName());
        }
    }
}
