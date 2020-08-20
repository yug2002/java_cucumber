package com.cucumber.junit.elements.webelements;

import com.cucumber.junit.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Button extends Element {

    public Button(By _by) {
        super(_by);
    }

    public Button(WebElement webElement) {
        super(webElement);
    }
}
