package testcases;

import driverfactory.DriverBaseTest;
import pages.AppointmentPage;
import pages.HomePage;
import pages.ProfilePage;
import org.testng.annotations.Test;

public class ProfilePageTests extends DriverBaseTest {
    HomePage homePage;
    AppointmentPage appointmentPage;
    ProfilePage profilePage;

    @Test
    public void ProfileButtonTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        profilePage = new ProfilePage(driver,wait);

        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        appointmentPage.Login();
        profilePage.ProfilePageButtonTest();

    }
}
