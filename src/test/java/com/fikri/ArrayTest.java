package com.fikri;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {


    @Test
    void getArray() {

        Class<String[]> stringArrayClass = String[].class;
        Class<int[][]> intArrayClass = int[][].class;

        System.out.println(stringArrayClass.isArray());
        System.out.println(intArrayClass.isArray());
    }


    @Test
    void arrayMemberTest() {

        Class<String[]> stringArrayClass = String[].class;
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
    }


    @Test
    void getData() {
        Class<String[]> stringArrayClass = String[].class;
        Object array = Array.newInstance(stringArrayClass.getComponentType(), 10);

        Array.set(array,0, "fikri");
        Array.set(array,1, "s");

        System.out.println(Array.get(array,0));
        System.out.println(Array.get(array,1));
    }
}
