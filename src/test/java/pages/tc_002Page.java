package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By nuevoArticuloButton = By.id("nuevoArticulo");
    By createForm = By.id("createForm");
    By titleField = By.id("title");
    By contentField = By.id("content");
    By submitButton = By.id("submitArticle");
    By successMessage = By.id("successMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNuevoArticulo() {
        driver.findElement(nuevoArticuloButton).click();
    }

    public boolean isCreateFormDisplayed() {
        return driver.findElement(createForm).isDisplayed();
    }

    public void fillAndSubmitForm(String title, String content) {
        driver.findElement(titleField).sendKeys(title);
        driver.findElement(contentField).sendKeys(content);
        driver.findElement(submitButton).click();
    }

    public boolean isArticleCreated() {
        return driver.findElement(successMessage).isDisplayed();
    }
}