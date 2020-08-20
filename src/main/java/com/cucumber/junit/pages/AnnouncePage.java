package com.cucumber.junit.pages;

import com.cucumber.junit.elements.Element;
import org.openqa.selenium.By;

public class AnnouncePage extends BasePage {

    private static final By TITLE = By.className("hero-header");

    public Element titleElement() {
        return findElement(TITLE);
    }
}
