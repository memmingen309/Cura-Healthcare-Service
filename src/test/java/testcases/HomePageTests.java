package testcases;

import driverfactory.DriverBaseTest;
import pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }
    @Test
    public void homepageMakeAppointmentButtonTest(){
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
    }


}
