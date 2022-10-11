package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

public class ModifierTest {

    @Test
    void modifierClassTes() {

        Class<Person> personClass = Person.class;

        System.out.println(personClass.getModifiers());
        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isFinal(personClass.getModifiers()));
        System.out.println(Modifier.isStatic(personClass.getModifiers()));
    }
}
