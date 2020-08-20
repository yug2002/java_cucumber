package com.cucumber.junit.elements;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.utils.helpers.StringHelper;
import org.openqa.selenium.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.cucumber.junit.utils.ApplicationWaiter.WaitFor;
import static com.cucumber.junit.utils.ApplicationWaiter.getFluentWait;

public class Element implements Find {

    protected WebDriver driver;
    protected WebElement element;
    protected By by;

    public Element(By _by) {
        this.driver = DriverManager.getDriver();
        this.by = _by;
        this.element = getFluentWait(driver).until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
    }

    public Element(WebElement webElement) {
        this.driver = DriverManager.getDriver();
        this.element = webElement;
    }

//    public void click() {
//        WaitFor(result -> this.element.isDisplayed());
//        this.element.click();
//    }

    public void clear() {
        this.element.clear();
    }

    public String getTagName() {
        return null;
    }

    public String getAttribute(String name) {
        return null;
    }

    public boolean isSelected() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public String text() {
        return this.element.getText();
    }

    public List<Element> findElements(By by) {

//        List<WebElement> list = ApplicationWaiter.getFluentWait(driver).until(new Function<WebDriver, List<WebElement>>() {
//            @Override
//            public List<WebElement> apply(WebDriver driver) {
//                return driver.findElements(by);
//            }
//        });
        WaitFor(result -> driver.findElements(by).size() > 0);
        return driver.findElements(by).stream().map(el -> new Element(el)).collect(Collectors.toList());
    }

    public Element findElement(By by) {
        WaitFor(result -> driver.findElements(by).size() > 0);
        return new Element(by);
    }


    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }


    public Point getLocation() {
        return null;
    }


    public Dimension getSize() {
        return null;
    }


    public Rectangle getRect() {
        return null;
    }


    public String getCssValue(String propertyName) {
        return null;
    }


    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }

    public String getStringLocator(){
        return StringHelper.getStringLocatorFromBy(this.by);
    }
}
