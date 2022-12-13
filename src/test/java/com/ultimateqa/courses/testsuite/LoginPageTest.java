package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.getTextMessage(), expectedMessage, "Welcome Back! not displayed");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        loginPage.enterUserName("standard_user@gmail.com");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getUserNameErrorMessage(), expectedMessage, "Invalid email or password not displayed");
    }
}
