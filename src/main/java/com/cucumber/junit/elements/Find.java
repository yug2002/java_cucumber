package com.cucumber.junit.elements;

import org.openqa.selenium.By;

import java.util.List;

public interface Find {
    Element findElement(By by);
    List<Element> findElements(By by);
}
