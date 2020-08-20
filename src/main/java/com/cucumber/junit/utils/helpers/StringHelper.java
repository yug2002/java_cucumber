package com.cucumber.junit.utils.helpers;

import org.openqa.selenium.By;

public class StringHelper {

    private static final String REGEXP_FOR_LOCATOR = "^By.\\w+:\\s+";

    public static String getStringLocatorFromBy(By by){
        return by.toString().replaceAll(REGEXP_FOR_LOCATOR,"");
    }
}
