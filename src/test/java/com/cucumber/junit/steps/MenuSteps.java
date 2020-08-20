package com.cucumber.junit.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class MenuSteps extends BaseSteps{

    @When("the user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.open();
    }

    @When("the user clicks on the {string} section")
    public void clickOnSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("the user clicks on the {string} link")
    public void clickOnLink(String link) {
        homePage.docsLinksContainer().itemLinksByName(link).click();
    }

    @Then("page with title {string} is displayed")
    public void verifyPageTitlePresence(String title) {
        assertThat(docsPage.IsTitleDisplayed(title))
                .overridingErrorMessage("Page with title '%s' is not displayed", title)
                .isTrue();
    }
}
