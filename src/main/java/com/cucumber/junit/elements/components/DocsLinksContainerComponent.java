package com.cucumber.junit.elements.components;

import com.cucumber.junit.elements.Component;
import com.cucumber.junit.elements.ElementFactory;
import com.cucumber.junit.elements.webelements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;



public class DocsLinksContainerComponent extends Component {

    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";

    public DocsLinksContainerComponent(By _by) {
        super(_by);
    }

    public DocsLinksContainerComponent(WebElement webElement) {
        super(webElement);
    }

    public Link itemLinksByName(String name){

        String text = format(TEXT_PATTERN, this.getStringLocator() + "//a", name);
        return ElementFactory.link(By.xpath(text)).get();
    }

}
