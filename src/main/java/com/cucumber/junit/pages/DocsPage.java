package com.cucumber.junit.pages;

import com.cucumber.junit.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;

public class DocsPage extends BasePage {

    private static final String PAGE_TITLE_PATTERN = "//*[starts-with(@class, 'page-header')]/*[contains(@class, 'title') and contains(text(), '%s')]";

    private static final By LEFT_MENU_ITEM = By.className("panel-group");

    public boolean IsTitleDisplayed(String title){
        return this.isElementDisplayed(By.xpath(format(PAGE_TITLE_PATTERN, title)));
    }

    public List<Element> listOfLeftMenuItems(){
        return this.findElements(LEFT_MENU_ITEM);
    }

}
