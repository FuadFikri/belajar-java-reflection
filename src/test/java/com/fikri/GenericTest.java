package com.fikri;

import com.fikri.data.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class GenericTest {

    @Test
    void genericTest() {

        Class<Data> dataClass = Data.class;

        for (TypeVariable<Class<Data>> typeParameter : dataClass.getTypeParameters()) {
            System.out.println(typeParameter.getName()); //T /Z
            System.out.println(typeParameter.getTypeName()); // T /Z
            System.out.println(Arrays.toString(typeParameter.getBounds())); // Object / AutoCloseable krn Z extend AutoClosable
            System.out.println("------------");
        }
    }
}
