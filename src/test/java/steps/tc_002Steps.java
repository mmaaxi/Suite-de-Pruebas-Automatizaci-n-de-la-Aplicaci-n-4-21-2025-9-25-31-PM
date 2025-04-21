package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page articlePage;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        // Assume driver is initiated elsewhere
        driver.get("http://yourwebsite.com/home");
        articlePage = PageFactory.initElements(driver, tc_002Page.class);
    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String buttonName) {
        articlePage.clickNuevoArticulo();
    }

    @Then("the create article form should be displayed")
    public void the_create_article_form_should_be_displayed() {
        Assert.assertTrue(articlePage.isCreateFormDisplayed());
    }

    @When("the user completes the form and submits it")
    public void the_user_completes_the_form_and_submits_it() {
        articlePage.fillAndSubmitForm("Example Title", "This is an example content.");
    }

    @Then("the article should be created successfully")
    public void the_article_should_be_created_successfully() {
        Assert.assertTrue(articlePage.isArticleCreated());
    }
}