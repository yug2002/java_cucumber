package com.cucumber.junit.steps;

import com.cucumber.junit.pages.AnnouncePage;
import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;
import com.cucumber.junit.pages.SearchPage;

public abstract class BaseSteps {

    //PageFactory pageFactory = new PageFactory(DriverManager.getDriver());

//    BasePage<HomePage> homePage = (HomePage) pageFactory.<HomePage>Get();
//    BasePage<SearchPage> searchPage = (SearchPage) pageFactory.<SearchPage>Get();
//    BasePage<AnnouncePage> announcePage = (AnnouncePage)pageFactory.<AnnouncePage>Get();
//    BasePage<DocsPage> docsPage = (DocsPage)pageFactory.<DocsPage>Get();

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    AnnouncePage announcePage = new AnnouncePage();
    DocsPage docsPage = new DocsPage();

}
