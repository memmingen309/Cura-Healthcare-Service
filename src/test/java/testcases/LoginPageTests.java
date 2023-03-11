package testcases;

import driverfactory.DriverBaseTest;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void LoginFailedTest(){
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        loginPage.LoginTest();
    }
}
