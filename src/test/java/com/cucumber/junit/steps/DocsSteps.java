package com.cucumber.junit.steps;

import com.cucumber.junit.elements.Element;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DocsSteps extends BaseSteps {

    @Then("there are {int} items in the left menu")
    public void verifyItemsLeftMenuSize(int expectedSize) {
        assertThat(docsPage.listOfLeftMenuItems())
                .overridingErrorMessage("expected size is not equal %s", expectedSize)
                .hasSize(expectedSize);
    }

    @Then("left menu contains following links")
    public void leftMenuContainsFollowingLinks(List<String> expectedTitles) {
        assertThat(docsPage.listOfLeftMenuItems())
                .extracting(Element::text)
                .as("list of titles doesn't contain some item or items")
                .containsAll(expectedTitles);
    }
}
