package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.elements.Element;
import com.cucumber.junit.elements.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

import static com.cucumber.junit.utils.ApplicationWaiter.WaitFor;

public abstract class BasePage implements Find {

    protected static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public Element findElement(By by) {

        WaitFor(result -> driver.findElement(by).isDisplayed());
        return new Element(by);
    }

    public List<Element> findElements(By by) {

        WaitFor(result -> driver.findElements(by).size() > 0);
        return driver.findElements(by).stream().map(el -> new Element(el)).collect(Collectors.toList());
    }

    public boolean isElementDisplayed(By by) {
        return !findElements(by).isEmpty();
    }

    public void open(String url) {
        this.driver.get(url);
    }
}
