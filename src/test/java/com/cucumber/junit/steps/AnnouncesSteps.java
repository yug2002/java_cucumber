package com.cucumber.junit.steps;

import com.cucumber.junit.elements.Element;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class AnnouncesSteps extends BaseSteps {

    @When("the user clicks on the search link")
    public void clickOnSearchLink() {
        homePage.searchLink().click();
    }

    @When("the user type text {string} in the search input field")
    public void typeTextInSearchInput(String typeText) {
        searchPage.searchInput().SendKeysWithTimeOut(typeText, 400);
    }

    @When("the user click on the {string} link in the left menu")
    public void clickOnLinkInLeftMenu(String linkName) {

        searchPage.LeftSideMenuItemByName(linkName).click();
    }

    @When("the user choose first item in the search results with pattern {string}")
    public void chooseFirstItemInSearchResults(String pattern) {
        searchPage.resultsContainer().linkToClick(pattern).click();
    }

    @Then("the user move to Announce page with title {string}")
    public void verifyThatAnnouncePageIsDisplayed(String title) {

        assertThat(announcePage.titleElement())
                .extracting(Element::text)
                .as("title is not as expected")
                .isEqualTo(title);
    }
}
