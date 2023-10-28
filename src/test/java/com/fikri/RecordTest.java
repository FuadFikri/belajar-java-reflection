package com.fikri;

import com.fikri.data.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RecordTest {


    @Test
    void test() {

        Class<Product> productClass = Product.class;

        System.out.println(productClass.isRecord());
        System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productClass.getDeclaredFields()));
        System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
    }
}
