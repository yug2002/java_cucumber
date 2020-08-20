package com.cucumber.junit.utils;

import com.cucumber.junit.pages.BasePage;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.InvocationTargetException;
import java.rmi.activation.Activator;

public class ObjectFactory {

    public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {

        return (T) c.newInstance();
    }


}
