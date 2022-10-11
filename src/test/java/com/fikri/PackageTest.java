package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PackageTest {


    @Test
    void packageTest() {

        Class<Person> personClass = Person.class;

        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
        System.out.println(Arrays.toString(aPackage.getAnnotations()));
        System.out.println(aPackage.getName());
        System.out.println(Arrays.toString(aPackage.getDeclaredAnnotations()));
    }
}
