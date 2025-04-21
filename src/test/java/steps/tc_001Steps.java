package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_001Page;

public class tc_001Steps {
    private WebDriver driver;
    private tc_001Page loginPage;
    private WebDriverWait wait;

    @Given("un usuario en la página de inicio de sesión")
    public void unUsuarioEnLaPaginaDeInicioDeSesion() {
        driver = Hooks.getDriver();
        loginPage = new tc_001Page(driver);
        loginPage.navigateToLoginPage();
    }

    @When("ingresa credenciales válidas")
    public void ingresaCredencialesValidas() {
        loginPage.enterUsername("usuarioValido");
        loginPage.enterPassword("passwordValido");
        loginPage.clickLoginButton();
    }

    @Then("el sistema redirige al dashboard")
    public void elSistemaRedirigeAlDashboard() {
        Assert.assertTrue(loginPage.isDashboardDisplayed());
    }

    @And("la sesión se mantiene activa")
    public void laSesionSeMantieneActiva() {
        Assert.assertTrue(loginPage.isSessionActive());
    }
}