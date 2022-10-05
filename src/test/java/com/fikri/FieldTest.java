package com.fikri;

import com.fikri.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {


    @Test
    void getFields() {
        Class<Person> personCLass = Person.class;
        Field[] fields = personCLass.getDeclaredFields();
        System.out.println("=== all field ===");
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }


        System.out.println("===========");
        System.out.println("==  public field ===");

        Field[] fields2 = personCLass.getFields();
        for (Field field : fields2) {
            System.out.println(field.getName() + " " + field.getType());

        }
    }


    @Test
    void getData() throws NoSuchFieldException, IllegalAccessException {

        Person person1 = new Person("fikri","fuad","fik@mail.com","0123");

        Class<Person> personClass = Person.class;

        Field firstName = personClass.getDeclaredField("firstName");

        Object firstNameValue = firstName.get(person1);
        System.out.println(firstNameValue);

        firstName.set(person1, "Joko");
        System.out.println(person1);
    }

    @Test
    void getData2() throws NoSuchFieldException, IllegalAccessException {

        Person person1 = new Person("fikri","fuad","fik@mail.com","0123");

        Class<Person> personClass = Person.class;

        Field phone = personClass.getDeclaredField("phone");
        phone.setAccessible(true); // phone adalah private field sehingga perlu set accessible jadi true

        Object phoneValue = phone.get(person1);
        System.out.println(phoneValue);

        phone.set(person1, "999");
        System.out.println(person1);
    }
}
