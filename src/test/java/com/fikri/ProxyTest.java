package com.fikri;


import com.fikri.data.Car;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    void test() {


        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("getName")){
                    return "Car Proxy is called";
                }

                if(method.getName().equals("run")){
                    System.out.println("car is running");
                }

                return null;
            }
        };

        Car car = (Car) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Car.class}, invocationHandler);

        System.out.println(car); //null
        System.out.println(car.getName()); //Car Proxy is called
        System.out.println(car.getClass()); //class com.sun.proxy.$Proxy9


        car.run(); //car is running

    }

}
