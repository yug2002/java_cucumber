package com.cucumber.junit.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Component extends Element {

    protected static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";

    public Component(By _by) {
        super(_by);
    }

    public Component(WebElement webElement) {
        super(webElement);
    }
}
