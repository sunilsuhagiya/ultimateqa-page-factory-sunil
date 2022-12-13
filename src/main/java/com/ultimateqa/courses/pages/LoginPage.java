package com.ultimateqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement textMessage;

    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement userNameField;

    @CacheLookup
    @FindBy(name = "user[password]")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement theErrorMessage;


    public String getTextMessage() {
        Reporter.log("Get Text Message" + textMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Tex tMessage ");
        return getTextFromElement(textMessage);
    }

    public void enterUserName(String email) {
        Reporter.log("Enter user name" + userNameField.toString());
        sendTextToElement(userNameField, email);
        CustomListeners.test.log(Status.PASS, "Enter user name " + email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter user name" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter user name " + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on login ");
    }

    public String getUserNameErrorMessage() {
        Reporter.log("Get Text Message" + theErrorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Message");
        return getTextFromElement(theErrorMessage);
    }

}
