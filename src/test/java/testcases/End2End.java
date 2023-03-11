package testcases;

import driverfactory.DriverBaseTest;
import driverfactory.DriverBaseTest;
import pages.AppointmentPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import org.testng.annotations.Test;
import pages.AppointmentPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class End2End extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    ProfilePage profilePage;

    @Test
    public void End2EndTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        profilePage = new ProfilePage(driver,wait);

        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        loginPage.LoginTest();
        appointmentPage.Login();
        appointmentPage.AppointmentTest();
        profilePage.ProfilePageButtonTest();
    }
}
