package com.cucumber.junit.pages;

import com.cucumber.junit.elements.ElementFactory;
import com.cucumber.junit.elements.components.DocsLinksContainerComponent;
import com.cucumber.junit.elements.webelements.Link;
import org.openqa.selenium.By;

import static java.lang.String.format;

public class HomePage extends BasePage {

    private static final String CUCUMBER_URL = "https://cucumber.io/";

    private static final String MENU_SECTION = "//*[contains(@class, 'nav-link')]";
    private static final String CHILD_MENU_ITEM = "//*[contains(@class, 'dropdown')]//*";

    private static final By SEACH_LINK = By.xpath("//*[contains(@class,'header-search')]");

    public void open(){
        this.open(CUCUMBER_URL);
    }

    public Link menuSection(String linkText){
        return ElementFactory.link(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText))).get();
    }

    public Link menuChildItem(String linkText){
        String t = format(TEXT_PATTERN, CHILD_MENU_ITEM, linkText);
        return ElementFactory.link(By.xpath(format(TEXT_PATTERN, CHILD_MENU_ITEM, linkText))).get();
    }

    public Link searchLink(){
        return ElementFactory.link(SEACH_LINK).get();
    }

    public DocsLinksContainerComponent docsLinksContainer (){
        return new DocsLinksContainerComponent(By.xpath("//div[./a[@href='/docs/cucumber/']]"));
    }
}
