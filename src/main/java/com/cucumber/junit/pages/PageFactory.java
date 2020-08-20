package com.cucumber.junit.pages;

import com.cucumber.junit.utils.ObjectFactory;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.InvocationTargetException;

public class PageFactory {

    WebDriver driver;
    public PageFactory(WebDriver _driver){
        this.driver = _driver;
    }

    public <T extends BasePage> T Get() {
        try{
            return (T) ObjectFactory.create(BasePage.class);
        }catch( IllegalAccessException | InstantiationException e){
            throw new RuntimeException(e);
        }

        //return (T) BasePage.class.getDeclaredConstructor(BasePage.class).newInstance(this.driver);
    }
}
