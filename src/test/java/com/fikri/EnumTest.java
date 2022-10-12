package com.fikri;

import com.fikri.data.Gender;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EnumTest {


    @Test
    void enumTest() throws NoSuchMethodException {

        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.getName());
        System.out.println(genderClass.getPackage());
        System.out.println(Arrays.toString(genderClass.getDeclaredMethods()));
        System.out.println(genderClass.getTypeName());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
    }
}
