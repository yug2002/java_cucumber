package com.cucumber.junit.elements.components;

import com.cucumber.junit.elements.Component;
import com.cucumber.junit.elements.ElementFactory;
import com.cucumber.junit.elements.webelements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class SearchResultsComponent extends Component {
    public SearchResultsComponent(By by) {
        super(by);
    }

    public SearchResultsComponent(WebElement webElement) {
        super(webElement);
    }

    public Link linkToClick(String pattern){
        return ElementFactory.link(By.xpath(format(this.TEXT_PATTERN, this.getStringLocator() + "//div[@class = 'item']//*", pattern))).get();
    }
}
