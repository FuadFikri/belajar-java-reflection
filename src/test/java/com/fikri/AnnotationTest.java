package com.fikri;

import com.fikri.data.Person;
import com.fikri.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {


    @Test
    void testValidation() throws IllegalAccessException {

        Person person = new Person("","fuad","f@mail.com","00221");
        Validator.validateNotBlank(person);
    }

    @Test
    void testValidation2() throws IllegalAccessException {

        Person person = new Person("fikri"," ","f@mail.com","00221");
        Validator.validateNotBlank(person);
    }

    @Test
    void testValidation3() throws IllegalAccessException {

        Person person = new Person("fikri",null,"f@mail.com","00221");
        Validator.validateNotBlank(person);
    }
}
