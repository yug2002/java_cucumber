package com.cucumber.junit.elements.webelements;

import com.cucumber.junit.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cucumber.junit.utils.ApplicationWaiter.WaitFor;

public class Link extends Element {
    public Link(By _by) {
        super(_by);
    }

    public Link(WebElement webElement) {
        super(webElement);
    }

    public void click(){

        WaitFor(result -> this.element.isDisplayed());
        this.element.click();
    }
}
