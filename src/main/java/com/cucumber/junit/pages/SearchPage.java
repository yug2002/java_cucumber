package com.cucumber.junit.pages;

import com.cucumber.junit.elements.Element;
import com.cucumber.junit.elements.ElementFactory;
import com.cucumber.junit.elements.components.SearchResultsComponent;
import com.cucumber.junit.elements.webelements.Input;
import com.cucumber.junit.elements.webelements.Link;
import org.openqa.selenium.By;

import java.util.List;

import static java.lang.String.format;

public class SearchPage extends BasePage {

    private static final By INPUT_FIELD = By.xpath("//div[@class = 'app-input']//input");
    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
    private static final String LEFT_SIDE_MENU_ITEM =
            "//*[contains(@class, 'filter-item') and not(contains(@class,'disabled'))]//*[@class='filter-item-name']";
    private static final By RESULTS_ITEM = By.className("item");
    private static final By resultsStory = By.xpath("//div[@class = 'results']");

    public Input searchInput() {
        return ElementFactory.input(INPUT_FIELD).get();
    }


    public Link LeftSideMenuItemByName(String name) {
        String d = format(TEXT_PATTERN, LEFT_SIDE_MENU_ITEM, name);
        return ElementFactory.link(By.xpath(format(TEXT_PATTERN, LEFT_SIDE_MENU_ITEM, name))).get();
    }

    public List<Element> resultItems() {
        return this.findElements(RESULTS_ITEM);
    }


    public SearchResultsComponent resultsContainer() {
        return new SearchResultsComponent(resultsStory);
    }
}
